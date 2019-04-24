/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ngona
 */
public class Connect {
     private Connection con;

    public Connect() {
    }
     
     private void getDBConnection(String dbName, String username,String password)
    {
        String dbUrl = "jdbc:mysql://localhost:3306/" + dbName;
        String dbClass = "com.mysql.jdbc.Driver";
        try {
         Class.forName(dbClass);
         con = DriverManager.getConnection (dbUrl, username, password);
        }catch(Exception e) {
         e.printStackTrace();
        } 
    }
}
