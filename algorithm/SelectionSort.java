/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithm;


public class SelectionSort  implements AlgorithmSorting{
    @Override
    public void sort(int [] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=0;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
    @Override
    public String getname(){
        return"Selection sort";
    }
}
