/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithmsbenchmark_tarea2;

/**
 *
 * @author enrique
 */
public class ShellSort {
    
    private int [] array;
    
    public ShellSort(int[] pDato){
        array=pDato;
        ShellSortM();
    }
    
    public void ShellSortM() {
    for ( int increment = array.length / 2;increment > 0;
          increment = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))) {
        for (int i = increment; i < array.length; i++) {
            for (int j = i; j >= increment && array[j - increment] > array[j]; j -= increment) {
                int temp = array[j];
                array[j] = array[j - increment];
                array[j - increment] = temp;
            }
        }
    }
}
    
     public void paint(){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    
}
