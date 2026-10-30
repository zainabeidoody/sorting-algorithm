/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithm;


public class BubbleSort implements AlgorithmSorting {
    @Override
    public void sort(int []arr){
        int n = arr.length;
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                
                if(arr[j]>arr[j+1]){
                   int swap = arr[i];
                   arr[i] = arr[j];
                   arr[j] = swap;
                }
            }
        }}
    @Override
    public String getname(){
        return"bubble sort";
    }
    
}
