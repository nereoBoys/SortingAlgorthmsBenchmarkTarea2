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
public class QuickSort {
   
    private int [] array;
    
    public QuickSort(int[] pDato){
        array=pDato;
        QuickSortM(array,0,array.length-1);
    }
    
    
     public void QuickSortM(int array[], int izq, int der) {

        int pivote=array[izq]; // tomamos primer elemento como pivote
        int i=izq; // i realiza la búsqueda de izquierda a derecha
        int j=der; // j realiza la búsqueda de derecha a izquierda
        int aux;

        while(i<j){            // mientras no se crucen las búsquedas
           while(array[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
           while(array[j]>pivote) j--;         // busca elemento menor que pivote
           if (i<j) {                      // si no se han cruzado                      
               aux= array[i];                  // los intercambia
               array[i]=array[j];
               array[j]=aux;
           }
         }
         array[izq]=array[j]; // se coloca el pivote en su lugar de forma que tendremos
         array[j]=pivote; // los menores a su izquierda y los mayores a su derecha
         if(izq<j-1)
            QuickSortM(array,izq,j-1); // ordenamos subarray izquierdo
         if(j+1 <der)
            QuickSortM(array,j+1,der); // ordenamos subarray derecho
    }
     
      public void paint(){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    

}
