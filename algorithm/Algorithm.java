/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algorithm;


public class Algorithm {
    public static void runBenchmark(String name,int []arr ,AlgorithmSorting []alg){
        System.out.println("#1 :" + name);
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        for(AlgorithmSorting algo : alg){
            long starttime = System.nanoTime();
            long endtime = System.nanoTime();
            long all = endtime-starttime;
            System.out.println(" "+ algo.getname()+"nano time = "+all+"ns");
        }
    }

   
    public static void main(String[] args) {
       int size = 1000;
       int [] random = GeneratArray.generaterRandomArray(size);
       int [] descend = GeneratArray.generateDescending(size);
       int []duplicate = GeneratArray.duplicates(size);
       int [] sorted = GeneratArray.sortedarray(size);
       AlgorithmSorting [] algorithms = {new SelectionSort(),new Insertionsort() ,new BubbleSort(),new MergSort() , new QuickSort()};
       
       runBenchmark("1 random",random,algorithms);
       runBenchmark("2 descending",descend,algorithms);
       runBenchmark("3 duplicate",duplicate,algorithms);
       runBenchmark("4 sorted",sorted,algorithms);
    }
    
}
