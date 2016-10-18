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
public class BubbleSort {
    
    private int [] array;
    
    public BubbleSort(int [] pDato){
        array=pDato;
        BubbleSortM();
    }
    
    /**
     * Metodo encargado de ordenar la lista que recibe la clase BubbleSort
     */
    public void BubbleSortM(){
        boolean bandera=true;
        int cont=0;
        int tmp=0;
        while (true){
            if (cont==array.length-1){
                if(bandera==false){
                    cont=0;
                    bandera=true;
                }else{
                    break;
                }
            }else{
                if(array[cont]>array[cont+1]){
                  tmp=array[cont+1];
                  array[cont+1]=array[cont];
                  array[cont]=tmp;
                  bandera=false;
                  cont+=1;
                }else{
                    cont+=1;
                }
            }
        
        }
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
