/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Messagerie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jerome
 */
public class ConnexionBDD {//CTRL + SHIFT + O pour générer les imports

  public static void main(String[] args) {      
    try {
      Class.forName("org.postgresql.Driver");
      System.out.println("Driver O.K.");

      String url = "jdbc:postgresql://localhost:5432/JAVA";
      String user = "postgres";
      String passwd = "stri";

      Connection conn = DriverManager.getConnection(url, user, passwd);
      System.out.println("Connexion effective !");         
         
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }      
  }
}
    
    
