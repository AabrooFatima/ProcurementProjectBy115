/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author A R F T
 */
public class Request  {
    
    private String itemName;
    private int itemQuant;
    
    public String getName()
    {
        return this.itemName;
    }
    
    
    public void setName(String n)
    {
        this.itemName=n;
    }
    public int getQuant()
    {
        return this.itemQuant;
    }
    public void setQuant(int q)
    {
        this.itemQuant=q;
    }
}
