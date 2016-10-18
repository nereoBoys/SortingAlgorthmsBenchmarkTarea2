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
public class InsertionSort {
    
    private int[] array;
    
    public InsertionSort(int[] pDato){
        array=pDato;
        InsertionSortM();
    }
    
    public void InsertionSortM() {
      for (int i=1; i < array.length; i++) {
         int aux = array[i];
         int j;
         for (j=i-1; j >= 0 && array[j] > aux; j--){
              array[j+1] = array[j];
          }
         array[j+1] = aux;
      }
   }
    
     public void paint(){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    
}
