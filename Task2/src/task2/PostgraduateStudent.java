/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author A R F T
 */
public class PostgraduateStudent extends Student implements PSInterface {
    
    
    @Override
    public void getName()
    {
        System.out.println("I am a undergraduate student");
    }
    public String Disciplien()
    {
        return "CS";
    }
    
}
