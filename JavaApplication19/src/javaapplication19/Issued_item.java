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
public class Issued_item extends Item {
    
    public String status;
    public String id;
    public boolean setIssued(Item obj)
    {
        boolean f=false;
        this.setName(obj.getName());
        this.setQuantity(obj.getQuantity());
        this.setCategory(obj.getCategory());
         this.setSupplier(obj.getSupplier().getName(),obj.getSupplier().getEmail(),obj.getSupplier().getContact(), obj);
        this.status= "Not returned";
        f=true;
        return f;
    }
}
