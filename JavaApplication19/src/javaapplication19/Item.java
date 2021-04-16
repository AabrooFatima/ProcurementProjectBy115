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
    private Vendor Supplier=new Vendor();
    private String category;
    
    
    public boolean setItem(String n,int q,String sN, String sC, String sE,String c,Item obj)
    {
        
        this.setName(n);
        this.setCategory(c);
        this.setQuantity(q);
        Supplier.setName(sN);
        Supplier.setContact(sC);
        Supplier.setEmail(sE);
        //boolean f=this.setSupplier(sN, sE, sC,obj);
        return true;
    }
    
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
    public boolean setSupplier(String n, String e, String c,Item obj)
    {
        boolean f=false;
        if(validName(n))
        {
            System.out.println(n);
            Supplier.setName(n);
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
        f=true;
        if(f)
        System.out.println("Item added");
        return f;
    }
    public String getSuppliername()
    {
        return this.Supplier.getName();
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
