/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;
import com.entities.*;
import java.sql.*;
/**
 *
 * @author Surya Jyoti
 */
public class connectdao {
    private Connection con;
    public connectdao(Connection con)
    {   
        super();
        this.con=con;
    }

    public connectdao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean userRegister(user us)
    {
        boolean f=false;
        try
        {
            String qu="insert into javaclass(name,email,password) values(?,?,?)";
            PreparedStatement ps=con.prepareStatement(qu);
            ps.setString(1,us.getName());
            ps.setString(2,us.getEmail());
            ps.setString(3,us.getPassword());
            ps.executeUpdate();
            f=true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
      return f;
    }
    public user getLogin(String em,String ps)
    {
        user us=null;
         try
         {
             String qu="select * from javaclass where email=? and password=?";
             PreparedStatement pst=con.prepareStatement(qu);
             pst.setString(1, em);
             pst.setString(2, ps);
             ResultSet rs=pst.executeQuery();
             if(rs.next())
             {
                  us=new user(rs.getString(1),rs.getString(2),rs.getString(3));
             }
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
         return us;
    }
}
