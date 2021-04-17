/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author A F H
 */
public class Driver {
     static Login l= new Login();
    public static void hidden()
    {
       
        l.setVisible(false);
    }
    
    public static void main(String [] args)
    {
     Registered r= new Registered();
      l.setVisible(true);
    }
}
