/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author worod
 */
public class Student {
    private String name;
    private int id;
    private double avg;
    
    public Student(){
        name = " ";
        id = 0;
        avg = 0;
    }
    public Student(String n, int i, double a){
        name = n;
        id = i;
        avg = a;
    }
    public String toString(){
        return "Name is " + name + ", ID is " + id + ", Average =  " + avg;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setId(int newId){
        id = newId;
    }
    public void setAvg(double newAvg){
        avg = newAvg;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getAvg(){
        return avg;
    }
    
    public Student deepCopy(){
        Student newStudents = new Student(name, id, avg);
        return newStudents;
    }
    public int compareTo(String target)
    {
        return(name.compareTo(target));
    }
}
