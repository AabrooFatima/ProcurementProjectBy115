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
public class GraduateAssistance implements PSInterface, TeacherInterface {
    
    public void  getName()
    {
        System.out.println("I am a Graduate Assistant");
    }
    public String Subject()
    {
        return "Physics";
    }
    public String Disciplien()
    {
        return "Physics";
    }
}
