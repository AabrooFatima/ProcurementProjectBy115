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

/**
 *
 * @author Samyan
 */
public class ItemTableModel extends AbstractTableModel {

    private List<Employee> li = new ArrayList();
    private String[] columnNames = { "Employ Id",  "Name","Request","Quantity", "Action"};

    public ItemTableModel(List<Employee> list){
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
        Employee si = li.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return si.getId() ;
            case 1:
                return si.getName();
            case 2:
                return 
            
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
               return String.class;
             case 2:
                 return String.class;
             case 3:
                 return int.class;
             case 4:
                 return String.class;
                 
             }
             return null;
      }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
      
        return columnIndex == 1;
    }
   
    
    public void editRow(int row){
     String contact = (String)getValueAt(row, 1);
     
                
    }
    
                
    
   
 }