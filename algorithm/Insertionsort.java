/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithm;


public class Insertionsort implements AlgorithmSorting{
    @Override
    public void sort(int []arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int keyy = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>keyy){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1]=keyy;
        }
    }
    @Override
    public String getname()
    {
        return"Insertion sort";
    }    
}
