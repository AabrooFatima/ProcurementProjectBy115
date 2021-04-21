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
public class Apply {
    
    
    public static void process( Order obj, int n)
    {
        System.out.println("Using order: " + obj.name());
        System.out.println("Your Bill is: " +obj.calculate(n));
    }
}
