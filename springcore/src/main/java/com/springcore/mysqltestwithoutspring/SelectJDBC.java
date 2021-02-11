package com.springcore.mysqltestwithoutspring;

import java.sql.*;
public class SelectJDBC {
    public static void main(String[] args) throws SQLException {
        Connection con=ConnectionProvider.getConnection();
        
        String q="select* from table1";
        Statement stmt =con.createStatement();
        ResultSet set=stmt.executeQuery(q);
        System.out.println("ID     NAME     CITY");
        while(set.next()){
            int id=set.getInt(1);
            String name=set.getString(2);
            String city=set.getString(3);
            System.out.println(id+ " "+name +" " + city);
        }

    }
}
