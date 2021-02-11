package com.springcore.mysqltestwithoutspring;
import java.sql.*;
public class mysqltest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url ="jdbc:mysql://localhost:3306/youtube";
        String user="root";
        String password ="root";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);

        if(con.isClosed()){
            System.out.println("Connection is closed");
        }
        else{
            System.out.println("connection is created...");
        }
        
        // create a query
        String q="create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null, tCity varchar(400))";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(q);
        System.out.println("table created at database..");
    }
}
