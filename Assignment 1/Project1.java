/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author worod
 */
public class Project1 {

    
    public static void main(String[] args) {
        Listing l = new Listing();
        l.input();
        System.out.println(l.toString());
        l.setName("Adam");
        l.setAge("2");
        System.out.println("After changeing");
        System.out.println("name is " +l.getName()+ "\n age is " + l.getAge());
        
        
    }
    
}
