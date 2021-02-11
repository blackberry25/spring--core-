package com.springcore.mysqltestwithoutspring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Fun {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        String url ="jdbc:mysql://localhost:3306/youtube";
        String user="root";
        String password ="root";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        
        // create a dynamic query
        String q= "insert into table1(tName,tCity) values (?,?)";

        // get the PreparedStatement objectPreparedStatement
        PreparedStatement pstmt=con.prepareStatement(q);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name :");
        String name=br.readLine();

        System.out.println("Enter city: ");
        String city=br.readLine();

        // set the value to querry
        pstmt.setString(1, name);
        pstmt.setString(2, city);

        pstmt.executeUpdate();
        System.out.println("inserted...");


    }
}
