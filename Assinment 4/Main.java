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
        Listing students = new Listing(new Node("Adam" , 123, 4.0));
        students.append(new Node("Diaa", 456, 3.5));
        students.append(new Node("Worod" , 789, 3.75));
        
        students.insertAt(new Node("Amaly", 147, 2.9), 4);
        students.insertAt(new Node("Sam", 135, 2.8), 5);
        students.insertAt(new Node("Mike", 258, 3.4), 0);
        students.print();
    }
    
}
