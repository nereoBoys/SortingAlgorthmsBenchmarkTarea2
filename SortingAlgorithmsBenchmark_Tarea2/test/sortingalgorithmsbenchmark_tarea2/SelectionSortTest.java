/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithmsbenchmark_tarea2;

import java.util.Arrays;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author enrique
 */
public class SelectionSortTest {
    
    int[] array = new int[1000];
    
    public SelectionSortTest() {
        Random rnd = new Random();
        //int num = (rnd.nextInt(1001));
        //int num = 1;
        int num = 1000;
        for(int index=0;index<1000;index++){
            array[index] = num;
            //num++;
            num=num-1;
            //num = (rnd.nextInt(1001));           
        }  
        System.out.println("Arreglo original: "+Arrays.toString(array));
    }

    /**
     * Test of SelectionSortM method, of class SelectionSort.
     */
    @Test
    public void testSelectionSortM() {
        System.out.println("SelectionSort aplicado");
        SelectionSort instance = new SelectionSort(array);
        //instance.paint();
    }

    
}
