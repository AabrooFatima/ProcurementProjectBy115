/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author A R F T
 */
public class Panel1 extends javax.swing.JPanel {
 public String id;
 public int index;
    /**
     * Creates new form Panel1
     */
    public Panel1() {
        initComponents();
        hide();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        close = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txt2 = new javax.swing.JTextField();
        nl = new javax.swing.JLabel();
        el = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        del = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        cl = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        head = new javax.swing.JLabel();
        getid = new javax.swing.JTextField();
        get = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        view = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(null);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin");
        add(jLabel3);
        jLabel3.setBounds(100, 160, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\A R F T\\Documents\\GitHub\\GitHub\\JavaApplication19\\images\\male_user_100px.png")); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(70, 40, 100, 110);

        jButton1.setBackground(new java.awt.Color(233, 236, 239));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\A R F T\\Documents\\GitHub\\GitHub\\JavaApplication19\\images\\add_40px.png")); // NOI18N
        jButton1.setText("      Add Employ");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(0, 240, 260, 40);

        jButton2.setBackground(new java.awt.Color(233, 236, 239));
        jButton2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\A R F T\\Documents\\GitHub\\GitHub\\JavaApplication19\\images\\repository_40px.png")); // NOI18N
        jButton2.setText("     Manage Request");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(0, 400, 260, 40);

        jButton3.setBackground(new java.awt.Color(233, 236, 239));
        jButton3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\A R F T\\Documents\\GitHub\\GitHub\\JavaApplication19\\images\\google_tag_manager_40px.png")); // NOI18N
        jButton3.setText("     Manage Employ");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(0, 320, 260, 40);

        close.setBackground(new java.awt.Color(233, 236, 239));
        close.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        add(close);
        close.setBounds(80, 550, 90, 31);

        back.setBackground(new java.awt.Color(233, 236, 239));
        back.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        add(back);
        back.setBounds(80, 490, 90, 31);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\A R F T\\Documents\\GitHub\\GitHub\\JavaApplication19\\images\\Skyline.jpg")); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jLabel2);
        jLabel2.setBounds(0, 0, 260, 660);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );

        add(jPanel2);
        jPanel2.setBounds(0, 0, 260, 740);

        jPanel1.setBackground(new java.awt.Color(233, 236, 239));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        jPanel1.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 304, 180, -1));

        nl.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        nl.setText("Name:");
        jPanel1.add(nl, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 231, 70, 30));

        el.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        el.setText("Email:");
        jPanel1.add(el, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 376, -1, -1));

        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        jPanel1.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 376, 180, -1));

        del.setBackground(new java.awt.Color(152, 204, 253));
        del.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        del.setText("Delete");
        del.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        jPanel1.add(del, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 100, -1));

        edit.setBackground(new java.awt.Color(152, 204, 253));
        edit.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        edit.setText("Edit");
        edit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 600, 110, -1));

        cl.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        cl.setText("Contact:");
        jPanel1.add(cl, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 300, 90, 30));

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 231, 180, -1));

        head.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        head.setText("Add Employ");
        jPanel1.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 350, 80));
        jPanel1.add(getid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 120, -1));

        get.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        get.setText("Employ id:");
        jPanel1.add(get, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        add.setBackground(new java.awt.Color(152, 204, 253));
        add.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        add.setText("Add");
        add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 457, 128, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp ID", "Name", "Action"
            }
        ));
        jTable2.setToolTipText("Select a row to view Employ Requests");
        jTable2.setRowHeight(40);
        jTable2.setSelectionForeground(new java.awt.Color(223, 240, 254));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 640, 410));

        view.setBackground(new java.awt.Color(152, 204, 253));
        view.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        view.setText("View");
        view.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel1.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 120, -1));

        jTable1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employ ID", "Name", "Contact", "Email", "Action"
            }
        ));
        jTable1.setRowHeight(40);
        jTable1.setSelectionForeground(new java.awt.Color(223, 240, 254));
        jTable1.setVerifyInputWhenFocusTarget(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleName("");

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 640, 410));

        add(jPanel1);
        jPanel1.setBounds(260, 0, 640, 660);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        hide();
        head.setVisible(true);
        head.setText("Add Employ");
        cl.setVisible(true);
        el.setVisible(true);
        nl.setVisible(true);
        txt1.setVisible(true);
        txt2.setVisible(true);
        txt3.setVisible(true);
        add.setVisible(true);
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
       
        hide();
        head.setText("Manage Employ");
         
         jTable1.setVisible(true);
        jScrollPane1.setVisible(true);
        edit.setVisible(true);
        del.setVisible(true);
        get.setVisible(true);
        getid.setVisible(true);
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object[] rowData = new Object[5];
        //System.out.println(Registered.employees.size());
        for (int i = 0; i < Registered.employees.size(); i++) {
            rowData[0] = Registered.employees.get(i).getId();
            rowData[1] = Registered.employees.get(i).getName();
            rowData[2] = Registered.employees.get(i).getContact();
            rowData[3] = Registered.employees.get(i).getEmail();
            rowData[4] = "Select";
            model.addRow(rowData);
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        hide();
        head.setText("Manage Request");
        
         jTable2.setVisible(true);
        jScrollPane2.setVisible(true);
        model= (DefaultTableModel)jTable2.getModel();
        Object[] rowData = new Object[3];
        //System.out.println(Registered.employees.size());
        for (int i = 0; i < Registered.employees.size(); i++) {
            rowData[0] = Registered.employees.get(i).getId();
            rowData[1] = Registered.employees.get(i).getName();
            rowData[2] = "Select";
            
            model.addRow(rowData);
        }
        get.setVisible(true);
        getid.setVisible(true);
        view.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        Employee obj= new Employee();
        Admin a= new Admin();
        
        String n=txt1.getText();
        String c=txt2.getText();
        String e=txt3.getText();
        if(obj.setName(n) && obj.setContact(c) && obj.setEmail(e))
        {
            obj.setId();
            boolean f= a.addEmploy(obj);
            if(f)
            System.out.println("Success"); 
        }
        txt1.setText(null);
        txt2.setText(null);
        txt3.setText(null);
    }//GEN-LAST:event_addActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int n= jTable1.getSelectedRow();
        
        if(n>-1)
        {
            this.index=n;
            getid.setText(Registered.employees.get(n).getId());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
      
         this.id=getid.getText();
        Edit f= new Edit(this.id);
        f.setVisible(true);
        getid.setText(null);
    }//GEN-LAST:event_editActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
        Admin a= new Admin();
        this.id=getid.getText();
       boolean f=a.deleteEmploy(id);
       if(f)
       System.out.println("Successful");
       else
           System.out.println("Unsccessful");
       getid.setText(null);
    }//GEN-LAST:event_delActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        String i= getid.getText();
        Table t= new Table(i,index);
        t.setVisible(true);
    }//GEN-LAST:event_viewActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int n= jTable2.getSelectedRow();
        if(n >-1)
        {
            index = n;
            id= Registered.employees.get(n).getId();
            getid.setText(id);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Driver.hidden();
        Login l= new Login();
        l.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
     try {
         // TODO add your handling code here:
         finalize();
     } catch (Throwable ex) {
         Logger.getLogger(Panel1.class.getName()).log(Level.SEVERE, null, ex);
     }
     JOptionPane.showMessageDialog(null,"Thank you for using program");
     this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    public void viewTableData(){
        model=(DefaultTableModel) jTable1.getModel();
        Object[] rowData=new Object[5];
        rowData[0]="1";
        rowData[1]="22";
        rowData[2]="33";
        rowData[3]="144";
        rowData[4]="166";
        model.addRow(rowData);
    }
    DefaultTableModel model;
public void hide()
{
    view.setVisible(false);
    get.setVisible(false);
    getid.setVisible(false);
    add.setVisible(false);
        
        cl.setVisible(false);
        el.setVisible(false);
        nl.setVisible(false);
        txt1.setVisible(false);
        txt2.setVisible(false);
        txt3.setVisible(false);
         jTable1.setVisible(false);
        jScrollPane1.setVisible(false);
        jTable2.setVisible(false);
        jScrollPane2.setVisible(false);
        del.setVisible(false);
        edit.setVisible(false);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JLabel cl;
    private javax.swing.JButton close;
    private javax.swing.JButton del;
    private javax.swing.JButton edit;
    private javax.swing.JLabel el;
    private javax.swing.JLabel get;
    private javax.swing.JTextField getid;
    private javax.swing.JLabel head;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel nl;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
