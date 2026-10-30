/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithm;


public class QuickSort implements AlgorithmSorting {
    @Override
    public void sort(int []arr){
        if(arr==null || arr.length<=1){
            return;
        }
        
    }
    public static void quicksort(int []a,int left,int right){
        int middle;
        if (left>=right)
            return;
        else
           middle = partition(a,left,right)  ;
        quicksort(a,left,middle-1);
        quicksort(a,middle+1,right);
    }
    public static int partition(int []a, int left,int right){
        int x = a[left];
        int i = left;
        for(int j = left+1 ; j<right;j++){
            if(a[j]<x){
                i=i+1;
            int temp = a[i];
                a[i] = a[j];
                a[j]= temp;
            }
            
        }
        int temp = a[i+1];
        a[i+1] = a[left];
        a[left] = temp;
        
        return i+1;
    } 
    @Override
    public String getname(){
        return"Quick Sort";
    }
}
