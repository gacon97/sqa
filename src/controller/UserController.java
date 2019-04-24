/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.User;

/**
 *
 * @author ngona
 */
public class UserController {

    Connection conn = null;

    public UserController() {
        String dbUrl = "jdbc:mysql://localhost:3306/sqa";
        String dbClass = "com.mysql.jdbc.Driver";
        try {
            Class.forName(dbClass);
            conn = DriverManager.getConnection(dbUrl, "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<User> ListUsers(String ValToSearch) {
        ArrayList<User> usersList = new ArrayList<User>();

        Statement st;
        ResultSet rs;

        try {
            st = conn.createStatement();
            String searchQuery = "SELECT * FROM `users` WHERE CONCAT(`id`, `name`, `email`, 'sex', `phone`, 'cmnd', 'date_cmnd' ) LIKE '%" + ValToSearch + "%'";
            rs = st.executeQuery(searchQuery);

            User user;

            while (rs.next()) {
                user = new User(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("sex"),
                        rs.getString("phone"),
                        rs.getString("cmnd"),
                        rs.getDate("date_cmnd")
                );
                usersList.add(user);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return usersList;
    }
}
