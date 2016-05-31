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
              conn.setAutoCommit(false);
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
            conn.close();
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
    
     public ResultSet listeMembre() {
        
        try {
            Connection conn = connexion();
            Statement stmt = null;

            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT login FROM Users ORDER BY login ASC;");
            conn.close();    //BUGED ?
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
        return rs;
     }
     
     public ResultSet listeSalon(String nomSalon) {
             
        try {    
            Connection conn = connexion();
            Statement stmt = null;

            stmt = conn.createStatement();
            ResultSet rs; 
            String q = "SELECT S.nom_salon FROM SALON AS S, Users AS U, Acceder AS A \n" +
"	WHERE S.idsalon=A.idsalon AND U.login = A.login AND U.login='";
            q = q.concat(nomSalon);
            q = q.concat("';");
            rs = stmt.executeQuery(q);   
            conn.close();    //BUGED ?
            return rs;
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }  

        ResultSet rs = null;
        return rs;
     }
     
   
    public void insertSql(String requete) {

        try {
            Connection conn = connexion();
            Statement stmt = null;
            stmt = conn.createStatement();
            
            stmt.executeUpdate(requete);
            //stmt.close();
            conn.commit();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        }
        /**
         * Permet d'afficher l'historique des messages
         * @param numSalon
         * @return 
         * @throws SQLException 
         */
        public ResultSet recupHistoriqueSQL(String numSalon) throws SQLException{               
        Connection conn = connexion();
            Statement stmt = null;
            String msg = null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(IfAppli.class.getName()).log(Level.SEVERE, null, ex);
        }
            String recupMsg = "SELECT login_envoi,date_message,heure_message,contenu FROM Message WHERE  idsalon='";
            recupMsg = recupMsg.concat(numSalon);
            recupMsg = recupMsg.concat("';");
           // System.out.println(q);
          ResultSet rs = stmt.executeQuery(recupMsg);
            conn.close();    //BUGED ?
            return rs;
            
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
                 conn.close();    //BUGED ?    
            return descri;
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        }
        
        
        public String getIdSalon(String nomSalon)
        {
            String idSalon = null;        
        try {
            Connection conn = connexion();
            Statement stmt = null;
            stmt = conn.createStatement();
            String q = "SELECT idsalon FROM Salon Where nom_salon='";
            q = q.concat(nomSalon);
            q = q.concat("';");
           // System.out.println(q);
            ResultSet rs = stmt.executeQuery(q);
            
             while (rs.next()) {
            idSalon = rs.getString("idsalon"); 
            //System.out.println(descri);
            
             }
                 conn.close();    //BUGED ?    
            return idSalon;
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        }
        
        
        
        
        
        
        public String idSalonPrivee(String nomSalon)
        {
            String idSalon = null;        
        try {
            Connection conn = connexion();
            Statement stmt = null;
            stmt = conn.createStatement();
            String q = "SELECT id_salon FROM Salon Where nom_salon='";
            q = q.concat(nomSalon);
            q = q.concat("';");
           // System.out.println(q);
            ResultSet rs = stmt.executeQuery(q);
            
             while (rs.next()) {
            idSalon = rs.getString("id_salon");
            //System.out.println(descri);
            
             }
                 conn.close();    //BUGED ?    
            return idSalon;
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        } 
        
       /* public String SalonPrivee(String nomSalon)
        {
            String SalonPriveeExist = null;        
                            System.out.println("\n\n\n\nLancement salonprivee\n\n\n\n");
            Connection conn = connexion();
            Statement stmt = null;
        try {
            stmt = conn.createStatement();
                             System.out.println("\n\n\n\nLancement requete\n\n\n\n");
            String q = "SELECT nom_salon FROM Salon Where nom_salon='";
            q = q.concat(nomSalon);
            q = q.concat("';");
            System.out.println(q);
            ResultSet rs = stmt.executeQuery(q);
            
                System.out.println("\n\n\n\nSalonPriveeExist = à null\n\n\n\n");
            while (rs.next()) {
            SalonPriveeExist = rs.getString("nom_salon");
            
                             System.out.println("\n\n\n\nSalonPriveeExist = "+SalonPriveeExist+"\n\n\n\n");
            
             }
             if ("null".equals(SalonPriveeExist)){
                 System.out.println("\n\n\n\nSalonPriveeExist = à null\n\n\n\n");
             }
            return SalonPriveeExist;
                     } catch (SQLException ex) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return SalonPriveeExist;
        } */
        
        
        public String identificationSQL(String login,String mdp)
        {
         String result = "Login incorect";          
        try {
            Connection conn = connexion();
            Statement stmt = null;
            stmt = conn.createStatement();
            String q = "SELECT login,mdp FROM Users Where login ='";
            q = q.concat(login);
            q = q.concat("';");
           // System.out.println(q);
            ResultSet rs = stmt.executeQuery(q);
            
             while (rs.next()) {
                if (login.equals(rs.getString("login")))
                     {
                         if (mdp.equals(rs.getString("mdp")))
                         {
                             result = "ok";
                         }
                         else
                         {
                             result ="mot de passe Incorect";
                         }
                     
                     }
                else
                    {
                        result ="Login incorect";
                    }
                
            
            
             }
              conn.close();    //BUGED ?
            return result;
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        }
        
     /* ####*/
        
                
        public ResultSet getMembreCoSalon(String nomSalon)
        {
                   
        try {
            Connection conn = connexion();
            Statement stmt = null;
            stmt = conn.createStatement();
            String q = "select s.nom_salon,u.login from salon as s, users as u,acceder as a where s.idsalon=a.idsalon AND u.login=a.login AND  u.statut='t'  AND s.nom_salon='";
            q = q.concat(nomSalon);
            q = q.concat("';");
            
           // System.out.println(q);
            ResultSet rs = stmt.executeQuery(q);
            
             
                 conn.close();    //BUGED ?    
            return rs;
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        }

          
        
        
        
        
}
