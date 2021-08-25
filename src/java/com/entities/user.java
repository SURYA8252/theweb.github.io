/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

/**
 *
 * @author Surya Jyoti
 */
public class user {
    private String name;
    private String email;
    private String password;
    public user()
    {
       super();
    }
    public user(String name,String email,String password)
    {
        super();
         this.name=name;
         this.email=email;
         this.password=password;
    }
    public String getName()
    {
       return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getPassword()
    {
        return password;
    }
    public void SetPassword(String password)
    {
        this.password=password;
    }
}
