package com.springcore.mysqltestwithoutspring;
import java.sql.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.io.*;

public class ImageSave {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        String url ="jdbc:mysql://localhost:3306/youtube";
        String user="root";
        String password ="root";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);

        String q="insert into images(pic) values (?)";
        PreparedStatement pstmt= con.prepareStatement(q);
        // this one for directly giving location
        // FileInputStream fis=new FileInputStream("/Users/manishgupta/Desktop/switzerland.jpg");
        // for choosing file from desktop
        JFileChooser jfc= new JFileChooser();
        jfc.showOpenDialog(null);
        File file= jfc.getSelectedFile();
        FileInputStream fis =new FileInputStream(file);
        pstmt.setBinaryStream(1,fis,fis.available());
        pstmt.executeUpdate();
        System.out.println("Done pic inserted!");
    }
}
