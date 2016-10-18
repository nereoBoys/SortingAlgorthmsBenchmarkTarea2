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
public class SelectionSort {
    
    private int[] array;
    
    public SelectionSort(int[] pDato){
        array=pDato;
        SelectionSortM();
    }
    public void SelectionSortM() {
          int i, j, menor, pos, tmp;
          for (i = 0; i < array.length - 1; i++) { // tomamos como menor el primero
                menor = array[i]; // de los elementos que quedan por ordenar
                pos = i; // y guardamos su posición
                for (j = i + 1; j < array.length; j++){ // buscamos en el resto
                      if (array[j] < menor) { // del array algún elemento
                          menor = array[j]; // menor que el actual
                          pos = j;
                      }
                }
                if (pos != i){ // si hay alguno menor se intercambia
                    tmp = array[i];
                    array[i] = array[pos];
                    array[pos] = tmp;
                }
          }
}
    
     public void paint(){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    

}
