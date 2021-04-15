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
public class Person {
    
    private String Name;
    private String Email;
    private String Contact;
    
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
    public boolean setEmail(String e)
    {
        boolean f=false;
        if(validEmail(e))
        {
        this.Email=e;
        f=true;
        }
        return f;
    }
    public String getEmail()
    {
        return this.Email;
    }
    public boolean setContact(String c)
    {
        boolean f=false;
        if(validContact(c))
        {
        this.Contact=c;
        f=true;
        }
        return f;
    }
    public String getContact()
    {
        return this.Contact;
    }
    
    public boolean validEmail(String email)
    {
        int i,j,k;
    int count=0,counting=0,c=0;
    i=email.length();
    for(j=0;j<i;j++)
    {
        if(email.charAt(j)=='@')

       {  
           count=count +1;
          for(k=j+1;k<i;k++)
          counting=counting+1;
       }
       else
       c=c+1;
    }
    if(count==1 && counting>4 && c>0)
    {
    if(email.charAt(i-4)=='.'&& email.charAt(i-3)=='c'&&email.charAt(i-2)=='o'&&email.charAt(i-1)=='m')
    return true;
    else
    return false;
    }
    else
    return false;
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
    
    public boolean validContact(String c)
    {
        boolean flag=false;
        if(c.length()==11)
        {
            if(c.charAt(0)=='0')
            {
                for(int i=1;i<11;i++)
                {
                    if(c.charAt(i)>='0' && c.charAt(i)<='9')
                    {
                        flag=true;
                    }
                    else
                        return false;
                }
            }
            else
                return false;
        }
        else
            return false;
        
        return flag;
    }
    
    
    public boolean validId(String e)
    {
        boolean flag=false;
        int l= e.length();
        //System.out.println(l);
        if(l==5)
        {
            if(e.charAt(0)=='E' && e.charAt(1)== 'M'&& e.charAt(2)=='P' && e.charAt(3)=='-')
            {
                if(e.charAt(4)>='0' && e.charAt(4)<='9')
                {
                    //System.out.println("here");
                    flag=true;
                }
                else 
                {
                    //System.out.println(" hhaaayee");
                    flag= false;
                }
            }
            else
            {
            flag= false;
            
            }
        }
        else
        {
            flag= false;
             //System.out.println("i am here");
        }
        System.out.println(flag);
        return flag;
    }
    
}
