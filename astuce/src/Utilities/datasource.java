/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.sql.*;

/**
 *
 * @author Amal
 */
public class datasource {

    private static String url = "jdbc:mysql://localhost:3306/test";
    private static String user = "root";
    private static String pass = "";

    private static Connection conn;
    static datasource connexion;

    private datasource() {
        try {
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("done");
        } catch (SQLException e) {
            System.out.println("" + e.getMessage());
        }

    }

    public static datasource getInstance() {
        if (connexion == null) {
            connexion = new datasource();
        }
        return connexion;
    }

    public Connection getConnection() {
        return conn;

        //pour appliquer le singleton sur une classe il y a 3 etapes:
        // creer var static du mm type de la classe
        // construct type private
        //
    }
}
