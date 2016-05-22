/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.stri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jerome
 */
//Argument 
public class ConnexionBDD {

    public Connection connexion() {
        Connection conn = null;
        try {

            String url = "jdbc:postgresql://localhost:5432/java";
            String user = "postgres";
            String passwd = "stri";
            Class.forName("org.postgresql.Driver");
            //System.out.println("Driver O.K.");

            conn = DriverManager.getConnection(url, user, passwd);
            // System.out.println("Connexion effective !");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }
        return conn;
    }

    public void test() {
        try {
            Connection conn = connexion();
            Statement stmt = null;

            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Users;");

            while (rs.next()) {

                String login = rs.getString("login");
                String mdp = rs.getString("mdp");

                System.out.println("login = " + login);
                System.out.println("mdp = " + mdp);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
        public void insertSql(String requete) {

        try {
            Connection conn = connexion();
            Statement stmt = null;
            stmt = conn.createStatement();
            
            stmt.executeUpdate(requete);
            stmt.close();
            conn.commit();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        }     

        
        
        public String descriptionSQL(String nomSalon)
        {
            String descri = null;        
        try {
            Connection conn = connexion();
            Statement stmt = null;
            stmt = conn.createStatement();
            String q = "SELECT description_salon FROM Salon Where nom_salon='";
            q = q.concat(nomSalon);
            q = q.concat("';");
           // System.out.println(q);
            ResultSet rs = stmt.executeQuery(q);
            
             while (rs.next()) {
            descri = rs.getString("description_salon");
            //System.out.println(descri);
            
             }
                     
            return descri;
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        }
}
