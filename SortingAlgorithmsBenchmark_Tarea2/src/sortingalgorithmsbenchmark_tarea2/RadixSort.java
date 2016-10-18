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
public class RadixSort {
    
    private int[] array;
    
    public RadixSort(int[] pDato){
        array=pDato;
        RadixSortM();
    }
    
    
    public void RadixSortM()
    {
        int i, m = array[0], exp = 1, n = array.length;
        int[] b = new int[10];
        for (i = 1; i < n; i++)
            if (array[i] > m)
                m = array[i];
        while (m / exp > 0)
        {
            int[] bucket = new int[10];
            for (i = 0; i < n; i++)
                bucket[(array[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(array[i] / exp) % 10]] = array[i];
            for (i = 0; i < n; i++)
                array[i] = b[i];
            exp *= 10;        

        }

    } 
    
     public void paint(){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    
}
