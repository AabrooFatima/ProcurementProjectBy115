/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A R F T
 */
public class Admin {
    
    
    
    public boolean addEmploy(Employee obj)
    {
        boolean f=false;
        Registered.employees.add(obj);
        f=true;
        return f;
    }
    public boolean deleteEmploy(String id)
    {
        boolean f=false;
        Employee obj=new Employee();
        for(int i=0; i< Registered.employees.size();i++)
        {
            if(obj.getId().equals(id))
            {
                Registered.employees.remove(i);
                f=true;
                break;
            }
        }
        return f;
    }
    public boolean editEmploy( String id, Employee obj)
    {
        boolean f=true;
        Employee e= new Employee();
        for(int i=0;i<Registered.employees.size();i++)
        {
            e= Registered.employees.get(i);
            if(e.getId().equals(id))
            {
                e.setContact(obj.getContact());
                e.setEmail(obj.getEmail());
                e.setName(obj.getName());
                f=true;
                break;
            }
        }
        return f;
    }
    public boolean approveItem(Item obj)
    {
        boolean flag=false;
         Registered.Approve.add(obj);
         flag=true;
         return flag;
    }
}
