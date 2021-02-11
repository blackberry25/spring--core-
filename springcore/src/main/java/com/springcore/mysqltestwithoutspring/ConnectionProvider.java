package com.springcore.mysqltestwithoutspring;

import java.sql.*;

public class ConnectionProvider {
    private static Connection con;
    public static Connection getConnection()  {
        try{
            if(con==null){
                String url ="jdbc:mysql://localhost:3306/youtube";
                String user="root";
                String password ="root";
                Class.forName("com.mysql.jdbc.Driver");
                 con = DriverManager.getConnection(url, user, password);
                  System.out.println("connecting...");
                if(con!=null){
                    System.out.println("connected bro!");
                }
            }


        }
        catch(Exception e){
             e.printStackTrace();
        }
        return con;
    }
}
