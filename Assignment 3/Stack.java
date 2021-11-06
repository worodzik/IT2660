/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author worod
 */
public class Stack {
    private Student [] data;
    private Student [] newData;
    private int top;
    private int size;
    
    public Stack(){
        top = -1;
        size = 100;
        data = new Student[100];
    }
    
    public Stack(int n){
        top  = -1;
        size = n;
        data = new Student[n];
    }
    public boolean push (Student newStudent){
        if (top == (size - 1)){
            newData = new Student[data.length+1];
            for(int i= 0 ; i<size; i++){
                newData[i] = data[i];
            }
            top = top+1;
            newData[top] = newStudent.deepCopy();
            
            data = newData;
            return true;
        }
        else 
        {
            top = top+1;
            data[top] = newStudent.deepCopy();
            return true;
        }
    }
    public Student pop(){
        int topLocation;
        if (top == -1){
          return null;
        }
        else if (top>data.length){
            topLocation = top;
            top = top-1;
            
            return newData[topLocation];
        }
        else{
            topLocation = top;
            top = top-1;
            
            return data[topLocation];
            
           
        }
    }
    public void showAll(){
        if (top>data.length){
            for(int i = top; i>=0; i --){
                System.out.println(newData[i].toString());
            }
       }
        else{
            for(int i = top; i>=0; i --){
                System.out.println(data[i].toString());
            }
       }
            
    }
}
