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
public class MergeSort {
    
    private int[] array;
    
    public MergeSort(int[] pDato){
        array=pDato;
        MergeSortM(array,0,array.length-1);
    }
    
    /**
     * Metodo encargado de ordenar la lista que recibe la clase MergeSort
     * @param array
     * @param izq que es igual a 0 para el inicio del algoritmo
     * @param der que es igual al tamaño del array menos 1
     */
    public void MergeSortM(int array[],int izq, int der){
        if (izq<der){
            int m=(izq+der)/2;
            MergeSortM(array,izq, m);
            MergeSortM(array,m+1, der);
            Merge(array,m,izq, der);
    }
}
 /**
  * Este es un metodo auxiliar empleado por el metodo MergeSortM
  * @param array
  * @param m  el cual es igual izq+der dividido entre 2
  * @param izq
  * @param der 
  */
  public void Merge(int[] array,int m,int izq, int der){
   int i, j, k;
   int [] B = new int[array.length]; //array auxiliar
   for (i=izq; i<=der; i++) //copia ambas mitades en el array auxiliar
             B[i]=array[i];

             i=izq; j=m+1; k=izq;
             while (i<=m && j<=der) //copia el siguiente elemento más grande
             if (B[i]<=B[j])
                     array[k++]=B[i++];
             else
                     array[k++]=B[j++];
             while (i<=m) //copia los elementos que quedan de la
                           array[k++]=B[i++]; //primera mitad (si los hay)
 }
  
  /**
   * Metodo que imprime el atributo array de la clase
   */
  
   public void paint(){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    

}
