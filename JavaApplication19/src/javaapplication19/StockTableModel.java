/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import java.util.Scanner;
/**
 *
 * @author Samyan
 */
public class StockTableModel extends AbstractTableModel {

    private List<Item> li = new ArrayList();
    private String[] columnNames = { "Item", "Quantity", "Vendor", "Edit","Delete"};

    public StockTableModel(List<Item> list){
         this.li = list;
    }

    
   
    
    @Override
    public String getColumnName(int columnIndex){
         return columnNames[columnIndex];
    }
    
  

    @Override     
    public int getRowCount() {
        return li.size();
    }

    @Override        
    public int getColumnCount() {
        return columnNames.length; 
    }

    
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Item si = li.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return si.getName();
            case 1:
                return si.getQuantity();
            case 2:
                return si.getSuppliername();      
            case 3:
                return "Edit";
            case 4:
                        return "Delete";
            
           }
           return null;
   }

   @Override
   public Class<?> getColumnClass(int columnIndex){
       System.out.println("column index = " + columnIndex);
          switch (columnIndex){
             case 0:
               return String.class;
             case 1:
               return int.class;
             case 2:
               return String.class;
             case 3:
               return Date.class;
             case 4: 
               return String.class;
               
             }
             return null;
      }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
      
        return columnIndex == 4 || columnIndex==5;
    }
   
    
    public void editRow(int row){
     String item = (String)getValueAt(row, 0);
     int q;
     String w=JOptionPane.showInputDialog("Enter Quantity: ");
     q=Integer.parseInt(w);
     Inventory i= new Inventory();
     i.editItem(item, q);
                
    }
    
    
      
    public void deleteRow(int row){
     String item = (String)getValueAt(row, 0);
     Item o= new Item();
     Inventory i= new Inventory();
     int n=i.itemExist(item);
           if(n>=0)
           {
              boolean f= i.deleteItem(item);
              if(f)
                  System.out.println("Succesful");
           }
    }
   
 }