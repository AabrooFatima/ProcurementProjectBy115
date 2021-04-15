/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;
import java.util.*;
/**
 *
 * @author A R F T
 */
public class Employee extends Person {
    
    static List<Item> requests= new ArrayList();
    static List <Issued_item> issued= new ArrayList();
    private String ID;
    
    public boolean addRequest(Item obj)
    {
        boolean f= false;
        this.requests.add(obj);
        Registered.ReqItem.add(obj);
        f=true;
        return f;
    }
    public boolean addIssue( Issued_item obj)
    {
        boolean f=false;
        this.issued.add(obj);
        Registered.IssuedItem.add(obj);
        f=true;
        return f;
    }
     
    public boolean setId()
    {
        boolean f=false;
        int i= Registered.employees.size() +1;
        String s= "EMP"+i;
        this.ID= s;
        return f;
    }
    public String getId()
    {
      
        return this.ID;
      
    }
    public boolean deleteRequest(String n, String v)
    {
        boolean flag=false;
        Item obj=new Item();
        for(int i=0; i< requests.size();i++)
        {
            obj= requests.get(i);
            if(obj.getName().equals(n))
            {
                requests.remove(i);
                flag=true;
                break;
            }
        }
        return flag;
    }
    public boolean editRequest(String n, int q)
    {
         boolean f= false;
         Item match = new Item();
         for (int i=0;i<requests.size();i++)
         {
             match =requests.get(i);
             if(match.getName().equals(n))
             {
                 match.setQuantity(q);
                 f=true;
                 break;
                 
             }
         }
         return f;
    }
    
}
        