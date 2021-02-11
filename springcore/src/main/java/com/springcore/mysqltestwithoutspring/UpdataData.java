package com.springcore.mysqltestwithoutspring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.xdevapi.PreparableStatement;

import org.springframework.beans.propertyeditors.InputStreamEditor;

public class UpdataData {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        Connection con=ConnectionProvider.getConnection();
        // String url ="jdbc:mysql://localhost:3306/youtube";
        // String user="root";
        // String password ="Carrefour1";
        // Class.forName("com.mysql.jdbc.Driver");
        // Connection con = DriverManager.getConnection(url, user, password);
          String q="update table1 set tName=?, tCity=? where tId=?";
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter new name: ");
        String name=br.readLine();
        System.out.println("enter the city name:");
        String city=br.readLine();
        System.out.println("enter the student id");
        int id=Integer.parseInt(br.readLine());

       PreparedStatement pstmt=con.prepareStatement(q);
       pstmt.setString(1, name);
       pstmt.setString(2, city);
       pstmt.setInt(3, id);
       pstmt.executeUpdate();
       System.out.println("done!...");
       

        
    }
}
