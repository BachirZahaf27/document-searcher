/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Database {

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        // TODO code application logic here
        Connection conn=null;//connection to database
        //Statement stmt=null;//let me to use query
        //ResultSet rs=null;//show the data
        //String query = "Select * From Test.login";
        
        //try{
           // conn =  DriverManager.getConnection("jdbc:derby://localhost:1527/data", "test", "test");
            //stmt = conn.createStatement();
            //rs= stmt.executeQuery(query);
            
            //while(rs.next()){
            //int id =rs.getInt("ID");
           // String user = rs.getString("USERNAME");
           // String motpass = rs.getString("PASSWORD");
           // System.out.println(id+"\t  " + user+"\t  "  + motpass);
           // }
       // }
       // catch (SQLException e){
        //    e.printStackTrace();
       // }
        public static Connection java_db(){
        
        try{
            //Class.forName("org.sqlite.JDBC");//balak mnhadi hroz mnhaha 
            Connection conn =DriverManager.getConnection("jdbc:derby://localhost:1527/data", "test", "test");
           //JOptionPane.showMessageDialog(null, "Connection to database is successful");

            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    }
    

