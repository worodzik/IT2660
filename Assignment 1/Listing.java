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
import java.util.*;

public class Listing {
    private String name;
    private int age;
    
    public Listing(){
       name =" ";
       age = 0; 
    }
    public Listing (String n, int a){
        name = n;
        age = a;
    }
    
    public String toString(){
        return "name is " + name + "\n age is "+ age;
    }
    
    public void input(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name");
        name = keyboard.next();
        System.out.println("Enter the age");
        age = keyboard.nextInt();
    }
    
    public void setName(String newName){
        name = newName;
    }
    public void setAge(String newAge){
        age = Integer.parseInt(newAge);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
