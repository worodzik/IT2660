/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author worod
 */
import java.util.Random;

public class Merge {
   public static  void fill(int arr[]){
       Random ran = new Random();
       for(int i = 0; i<arr.length; i++){
           arr[i] = ran.nextInt();
       }
   }
   
   public static void display(int nums[]){
       System.out.println("The numbers are: ");
       for(int i = 0; i< nums.length; i++){
           System.out.print(nums[i] + "\t");
       }
   }
   
   public static void merge(int data[], int l, int m, int h){
        int first = m;
        int second = m + 1;
        int low = l;
        while ((low<=first) && (second <= h))  {
            if (data[l] < data[second])
                l++;
            else {
                int temp = data[second];
                for (int j = second - 1; j>= l; j--)
                    data[j+1] = data[j];
                data[l] = temp;
                l++;
                first++;
                second++;
            }
        }
   }
   
   public static void mergeSort(int data[],int low,int high)   {
       
        if (low >= high)
            return;
        int mid = (low+high)/2;
       
        mergeSort(data,low,mid);
        mergeSort(data,mid+1,high);
        
        merge(data,low,mid,high);
    }
    public static void main(String[] args) {
        int [] data = new int[100];
        
        fill(data);
        
        display(data);
        
        mergeSort(data,0,99);
        
        display(data);
    }
}
