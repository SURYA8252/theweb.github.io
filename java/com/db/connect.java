/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;
import java.sql.*;
/**
 *
 * @author Surya Jyoti
 */
public class connect {
    private static Connection conn;
    public static Connection getConnection()
    {
    try
    {
       if(conn==null)
       {
           Class.forName("org.apache.derby.jdbc.ClientDriver");
           
           //jdbc:mysql://127.0.0.1:3306/?user=root//
           conn=DriverManager.getConnection("jdbc:derby://localhost:1527/sign","sign","sign");

       }
    }
    catch(Exception e)
    {
          e.printStackTrace();
    }
    return conn;
  }
}
