/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithm;
import java.util.Arrays;
import java.util.Random;

public class GeneratArray {
    //#1
     public static int [] generaterRandomArray(int size){
         Random random = new Random();
        int []rand = new int[size];
        
        for(int i=0;i<size;i++){
            rand[i]= random.nextInt(1000);
        }
        return rand;
       }
     //#2
     public static int [] generateDescending(int size){
         int [] arr= generaterRandomArray(size);
        Arrays.sort(arr);
        
        int []desc = new int[size];
        
        for(int i=0;i<size;i++){           
            desc[i] = arr[size-1-i];
        }
        return desc;
     }
     //#3
     public static int[] duplicates(int size){
         Random random = new Random();
         int [] dupl = new int[size];
         
         for(int i=0;i<size;i++){
             dupl[i]= random.nextInt(50);
         }
         return dupl;
     }
     //#4
     public static int [] sortedarray(int size){
         int [] sor = generaterRandomArray(size);
         Arrays.sort(sor);
         return sor;
     } 
     
}
