package com.meditation.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Dbc {

    Connection connt = null;
    Properties pro = new Properties();

    String dri = pro.getProperty("driver");
    String url = pro.getProperty("url");
    String username = pro.getProperty("username");
    String password = pro.getProperty("password");


    static {
        try {
            Class.forName("");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection setConnt(){

        try {
            DriverManager.getConnection(pro.getProperty(""));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connt;
    }

}
