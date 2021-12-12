/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author worod
 */
public class Listing {
    private String name;
    private String id;
    private double avg;
    
    public Listing (String n, String i, double a){
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
    public void setId(String newId){
        id = newId;
    }
    public void setAvg(double newAvg){
        avg = newAvg;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public double getAvg(){
        return avg;
    }
    
    public Listing deepCopy(){
        Listing newList = new Listing(name, id, avg);
        return newList;
    }
    public String getKey(){
        return name;
    }
    public int compareTo(String key){
        return (name.compareTo(key));
    }
}
