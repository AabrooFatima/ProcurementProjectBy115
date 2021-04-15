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
public class Item {
    
    private String Name;
    private int Quantity;
    private Vendor Supplier;
    private String category;
    
    
    public boolean setQuantity(int i)
    {
        boolean f=false;
        this.Quantity=i;
        f=true;
        return f;
    }
    public int getQuantity()
    {
        return this.Quantity;
    }
     public boolean setName(String n)
    {
        boolean f=false;
       
        if(validName(n))
        {
        this.Name=n;
        f=true;
        }
        return true;
    }
    public String getName()
    {
        return this.Name;
        
    }
    
    public boolean setCategory(String c)
    {
        boolean f=false;
        if(c.equals("Returnable") || c.equals("Not returnable"))
        {
            this.category=c;
            f=true;
        }
        return f;
    }
    public boolean setSupplier(String n, String e, String c, Item obj)
    {
        boolean f=false;
        if(validName(n))
        {
            this.Supplier.setName(n);
        }
        if(Supplier.validEmail(e))
        {
            Supplier.setEmail(e);
        }
        if(Supplier.validContact(c))
        {
            Supplier.setContact(c);
        }
        Supplier.item.add(obj);
        if(! Registered.supply.contains(Supplier))
        {
          Registered.supply.add(Supplier);
        }
        else
        {
           for(int i=0;i< Registered.supply.size();i++)
           {
               Vendor v= new Vendor();
               if(v.equals(Supplier))
               {
                   v.item.add(obj);
                   break;
               }
           }
        }
        f=true;
        return f;
    }
    
    
    public boolean validName(String name)
    {
        boolean flag=false;;
    for(int i=0;i<name.length();i++)
    {
    if(name.charAt(i)>='A' && name.charAt(i)<='Z' || name.charAt(i)>='a' && name.charAt(i)<='z'||name.charAt(i)==' ')
    flag=true;
    else
      return false;
    }
     return flag;
    }
}
