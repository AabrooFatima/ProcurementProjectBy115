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
public class Admin extends Employee{
    
    
    
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
        System.out.println(id);
        for(int i=0; i< Registered.employees.size();i++)
        {
            obj= Registered.employees.get(i);
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
        boolean f= false;
        Employee e= new Employee();
        for(int i=0;i<Registered.employees.size();i++)
        {
            e= Registered.employees.get(i);
            if(e.getId().equals(id))
            {
                System.out.println("am here");
                Registered.employees.set(i, obj);
                f=true;
                break;
            }
        }
        return f;
    }
    public boolean approveItem(Request obj)
    {
        boolean flag=false;
         Registered.Approve.add(obj);
         flag=true;
         return flag;
    }
}
