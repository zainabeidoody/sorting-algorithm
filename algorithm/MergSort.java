/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithm;


public class MergSort implements AlgorithmSorting {
    @Override
    public void sort(int []arr){
        if(arr==null || arr.length<=1){
            return ;
        }
        mergsort(arr,0,arr.length);
    }
     public static void mergsort(int []a,int left, int right){
        int middle;
        if(left>=right){
            return;}
        middle = (left+right)/2;
        mergsort(a,left,middle);
        mergsort(a,middle+1,right);
         merg(a,left,middle,right);
     }
     
    public static void merg(int []a, int left ,int middle, int right){  
        
        int n1 = middle-left+1;
        int n2 = right-middle;
        int [] l = new int [n1];
        int [] r = new int [n2];
        
        for(int i = 0; i<n1;i++){
            l[i] = a[left+i];
        }
        for(int j=0;j<n2;j++){
            r[j] = a[middle +j +1];
        }
        int k=left;
        int i=0,j =0;
        while(i<n1 && j<n2){
            if(l[i]<= r[j])
                 a[k++]=l[i++];
            else 
                 a[k++]=r[j++];
        } 
        while(i<n1){
           a[k++] = l[i++];  
        }
        while(j<n2){
          a[k++] = r[j++];
        }
    }
    @Override
    public String getname(){
        return"Merg Sort";
    }
    
}
