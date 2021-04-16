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
public class Inventory {
    
   public boolean addItem(Item obj)
   {
       boolean f=false;
       Registered.stock.add(obj);
       f=true;
       return f;
   }
   public boolean deleteItem( String n)
   {
       boolean f= false;
       Item d= new Item();
       for(int i=0;i<Registered.stock.size();i++)
       {
           d= Registered.stock.get(i);
           if(d.getName().equals(n))
           {
               Registered.stock.remove(i);
               f=true;
               break;
           }
       }
       return f;
   }
   
   public boolean editItem(String n,int q)
   {
       boolean f=false;
       Item e= new Item();
       for(int i=0;i<Registered.stock.size();i++)
       {
           if(e.getName().equals(n))
           {
               e.setQuantity(q);
               f=true;
               break;
           }
       }
       return f;
   }
   public int itemExist(String it)
   {
       int n=-1;
       Item obj= new Item();
       for(int i=0;i<Registered.stock.size();i++)
       {
           obj= Registered.stock.get(i);
           if(obj.getName().equals(it))
           {
               n=i;
               return n;
           }
           
       }
       return n;
   }
}
