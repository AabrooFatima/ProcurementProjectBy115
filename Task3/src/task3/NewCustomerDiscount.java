/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author A R F T
 */
public class NewCustomerDiscount extends Order{
    
    
    public int calculate(int input)
    {
        int d = input * 10/100;
        input= input-d;
        return input;
    }
}
