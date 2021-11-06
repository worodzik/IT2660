/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author worod
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack s = new Stack(3);
        Student s1 = new Student("Adam", 123 , 4.0);
        Student s2 = new Student ("Mike", 456, 3.5);
        Student s3 = new Student ("Sarah", 789, 3.75);
        Student s4 = new Student ("Ali", 147, 2.50);
        Student s5 = new Student ("Bill", 258, 2.75);
        
        System.out.println(s.pop());
        s.push(s1);
        s.push(s2);
        s.push(s3);
        System.out.println();
        s.showAll();
        
        s.push(s4);
        System.out.println();
        System.out.println(s.pop());
        s.showAll();
    }
    
}
