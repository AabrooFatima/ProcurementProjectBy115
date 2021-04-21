/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project8;

/**
 *
 * @author A R F T
 */
public class SaloonCar extends Car {
    
    @Override
    public void Draw()
    {
       System.out.println("I am in Saloon car");   
    }
    
    public void Example( Vehical s)
    {
        System.out.print("I can manipulate Saloon car.");
    }
}
