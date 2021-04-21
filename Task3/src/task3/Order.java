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
abstract public class Order {
    
    public String name()
    {
        return getClass().getSimpleName();
    }
    
    abstract public int calculate(int input);
    
    
}
