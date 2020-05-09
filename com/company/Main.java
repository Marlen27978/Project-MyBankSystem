package com.company;

import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static MainFrame mf;
    /*private static Connection connection;
    private static String url = "jdbc:mysql://localhost/database?serverTimezone=Europe/Moscow&useSSL=false";
    private static String user = "root";
    private static String pass = "";*/

    public static void main(String[] args) {

        mf = new MainFrame();
        mf.setVisible(true);
    }
}
