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
public class Main {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the maximum size of the data set");
        int dataSet = keyboard.nextInt();
        Student [] students = new Student[dataSet];
        System.out.println("Enter the initial number of Students");
        int numS = keyboard.nextInt();
        for(int i = 0; i<numS ; i++){
            System.out.println("Enter the data for num"+ (i+1) + " Student");
            System.out.println("Enter Name, ID , Average");
            students[i] = new Student();
            students[i].setName(keyboard.next());
            students[i].setId(keyboard.nextInt());
            students[i].setAvg(keyboard.nextDouble());
        }
        int c = 0;
        do{
        menu();
         c = keyboard.nextInt();
        switch(c){
            case 1: 
                int l = students.length;
                System.out.println("Enter the data for the new Student");
                System.out.println("Enter Name, ID , Average");
                students[l-1] = new Student();
                students[l-1].setName(keyboard.next());
                students[l-1].setId(keyboard.nextInt());
                students[l-1].setAvg(keyboard.nextDouble());
                break;
                
            case 2:
                System.out.println("Which Student do you want?");
                int f = keyboard.nextInt();
                System.out.println(students[f-1].toString());
                break;
            case 3:
                System.out.println("Which Student do you want to delete?");
                int d = keyboard.nextInt();
                students[d-1] = null;
                break;
            case 4:
                System.out.println("Which Student do you want to update?");
                int u = keyboard.nextInt();
                System.out.println("Enter the new Information");
                System.out.println("Enter Name, ID , Average");
                students[u-1] = new Student();
                students[u-1].setName(keyboard.next());
                students[u-1].setId(keyboard.nextInt());
                students[u-1].setAvg(keyboard.nextDouble());
                break;
            case 5:
                
                for(int i=0;i<students.length; i++){
                    if(students[i]!=null)
                        System.out.println("Student " + (i+1) + ": " + students[i].toString());
                }
                break;
            
                
        }
        }while (c!=6);
        
        System.exit(0);
        
    }
    
    public static void menu(){
         System.out.println("Enter: 1 to insert a new student's information,\n" + "\n" +
                "2 to fetch and output a student's information,\n" + "\n" + "3 to delete a student's information,\n"
                +"\n" +"4 to update a student's information,\n" +"\n" +"5 to output all the student information in "
                + "sorted order, and\n" +"\n" +"6 to exit the program.");
    }
    
}
