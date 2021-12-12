/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author worod
 */
import java.util.*;
public class Test {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        String name, id;
        double avg;
        while(true){
            System.out.println("Enter: 1 to insert a new student's information,\n" + "\n" +
                "2 to fetch and output a student's information,\n" + "\n" + "3 to delete a student's information,\n"
                +"\n" +"4 to update a student's information,\n" +"\n" +"5 to output all the student information in "
                + "sorted order, and\n" +"\n" +"6 to exit the program.");
            int options = keyboard.nextInt();
            switch (options){
                case 1:
                    System.out.println("Enter the data for the new Student");
                    System.out.println("Enter Name, ID , Average");
                    bst.insertNode(new Listing(keyboard.next(), keyboard.next(), keyboard.nextDouble()));
                    break;
                case 2:
                    System.out.println("Enter the name of Student you want to fetch?");
                    if(!bst.fetch(keyboard.nextLine()))
                        System.out.println("no student found");
                    break;
                case 3:
                    System.out.println("Enter the name of the Student you want to delete?");
                    bst.deleteNode(keyboard.nextLine());
                    break;
                case 6:
                    break;
                
                default:
                    System.out.println("invalid Option");
            }
            if (options == 6)
                break;
        }
    }
    
}
