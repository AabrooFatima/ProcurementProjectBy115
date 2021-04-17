/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;
import java.util.*;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
/**
 *
 * @author A R F T
 */
public class Registered extends Person{
    static List<Employee> employees= new ArrayList();
    static List<Request> Approve = new ArrayList();
    static List <Issued_item> IssuedItem= new ArrayList();
    static List <Item> stock = new ArrayList();
    static List<Vendor> supply= new ArrayList();
    static List<Request> request= new ArrayList();
    
     protected  void finalize ()throws Throwable
    {
      boolean flag;
      try
      {
        saveEmploy();
        saveIssued();
        saveApproved();
        saveStock();
      super.finalize();
    }
    catch(Throwable e)
    {
        System.out.println("Exception ocurred");
      e.printStackTrace(); 
      //return false;
    }
    }
     public static void saveEmploy()
     {
         try
         {
         PrintWriter pw = new PrintWriter(new File("C:\\Users\\A R F T\\Documents\\GitHub\\GitHub\\JavaApplication19\\Employ.csv"));
          StringBuilder sb =new StringBuilder();
         
          for(int i=0;i<employees.size();i++)
          {
              sb.append(employees.get(i).getId()+",");
              sb.append(employees.get(i).getName()+",");
              sb.append(employees.get(i).getEmail()+",");
              sb.append(employees.get(i).getContact()+",");
              for(int j=0;j<employees.get(i).requests.size();j++)
              {
                  sb.append(employees.get(i).requests.get(j).getName()+",");
                  sb.append(employees.get(i).requests.get(j).getQuant()+",");
              }
              sb.append("\n");
              
          }
          pw.write(sb.toString());
          pw.close();
         
         }
         catch(Exception e)
         {
             System.out.println("File not created");
         }
         
        }
     
     public static void loadEmploy()
     {
         String fileName= "Employ.csv";
         File file= new File(fileName);
         Employee emp= new Employee();
         Request r= new Request();
        try {
            Scanner input= new Scanner(file);
            while(input.hasNextLine())
            {
                String data= input.nextLine();
                String [] arr= data.split(",");
                emp.setID(arr[0]);
                emp.setName(arr[1]);
                emp.setEmail(arr[2]);
                emp.setContact(arr[3]);
                for(int i=4;i<arr.length;i=i+2)
                {
                    r.setName(arr[i]);
                    int q= Integer.parseInt(arr[i+1]);
                    r.setQuant(q);
                    emp.addRequest(r);
                    r= new Request();
                }
                employees.add(emp);
                emp=new Employee();
            }
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registered.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public static void saveIssued()
     {
      try
         {
         PrintWriter pw = new PrintWriter(new File("C:\\Users\\A R F T\\Documents\\GitHub\\GitHub\\JavaApplication19\\Issued.csv"));
          StringBuilder sb =new StringBuilder();
         
          for(int i=0;i<IssuedItem.size();i++)
          {
              sb.append(IssuedItem.get(i).id+",");
              sb.append(IssuedItem.get(i).getName()+",");
              sb.append(IssuedItem.get(i).getQuantity()+",");
              sb.append(IssuedItem.get(i).getCategory()+",");
              sb.append(IssuedItem.get(i).status);
     
              sb.append("\n");
              
          }
          pw.write(sb.toString());
          pw.close();
         
         }
         catch(Exception e)
         {
             System.out.println("File not created");
         }
         
        }
        
     public static void loadIssued()
     {
         String fileName= "Issued.csv";
         File file= new File(fileName);
         Issued_item item  = new Issued_item();
         //Item obj= new Item();
         Request r= new Request();
        try {
            Scanner input= new Scanner(file);
            while(input.hasNextLine())
            {
                String data= input.nextLine();
                String [] arr= data.split(",");
                item.id=arr[0];
                item.setName(arr[1]);
                
                int q= Integer.parseInt(arr[2]);
                item.setQuantity(q);
                item.setCategory(arr[3]);
                item.status=arr[4];
               IssuedItem.add(item);
               item= new Issued_item();
               //obj.setName(arr[1]);
               //obj.setQuantity(q);
               //obj.setCategory(arr[3]);
               
            }
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registered.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     public static void saveApproved()
     {
      try
         {
         PrintWriter pw = new PrintWriter(new File("C:\\Users\\A R F T\\Documents\\GitHub\\GitHub\\JavaApplication19\\Approve.csv"));
          StringBuilder sb =new StringBuilder();
         
          for(int i=0;i<Approve.size();i++)
          {
              sb.append(Approve.get(i).getName()+",");
              sb.append(Approve.get(i).getQuant());
              sb.append("\n");
              
          }
          pw.write(sb.toString());
          pw.close();
         
         }
         catch(Exception e)
         {
             System.out.println("File not created");
         }
         
        }
     public static void loadApprove()
     {
         String fileName= "Approve.csv";
         File file= new File(fileName);
         
         //Item obj= new Item();
         Request r= new Request();
        try {
            Scanner input= new Scanner(file);
            while(input.hasNextLine())
            {
                String data= input.nextLine();
                String [] arr= data.split(",");
                
                r.setName(arr[0]);
                int q= Integer.parseInt(arr[1]);
                r.setQuant(q);
                Approve.add(r);
                r= new Request();
            }
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registered.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
      public static void saveStock()
     {
      try
         {
         PrintWriter pw = new PrintWriter(new File("C:\\Users\\A R F T\\Documents\\GitHub\\GitHub\\JavaApplication19\\Stock.csv"));
          StringBuilder sb =new StringBuilder();
         
          for(int i=0;i<stock.size();i++)
          {
             
              sb.append(stock.get(i).getName()+",");
              sb.append(stock.get(i).getQuantity()+",");
              sb.append(stock.get(i).getCategory()+",");
              sb.append(stock.get(i).getSuppliername()+",");
              sb.append(stock.get(i).getSupplier().getEmail()+",");
              sb.append(stock.get(i).getSupplier().getContact()+",");
              sb.append("\n");
              
          }
          pw.write(sb.toString());
          pw.close();
         
         }
         catch(Exception e)
         {
             System.out.println("File not created");
         }
         
        }
      public static void loadStock()
     {
         String fileName= "Stock.csv";
         File file= new File(fileName);
         Item item  = new Issued_item();
         //Item obj= new Item();
         Request r= new Request();
        try {
            Scanner input= new Scanner(file);
            while(input.hasNextLine())
            {
                String data= input.nextLine();
                String [] arr= data.split(",");
                item.setName(arr[0]);
                int q= Integer.parseInt(arr[1]);
                item.setQuantity(q);
                item.setCategory(arr[2]);
                item.setSupplier(arr[3], arr[4], arr[5], item);
                stock.add(item);
                item= new Item();
               
               //obj.setName(arr[1]);
               //obj.setQuantity(q);
               //obj.setCategory(arr[3]);
               
            }
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registered.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
