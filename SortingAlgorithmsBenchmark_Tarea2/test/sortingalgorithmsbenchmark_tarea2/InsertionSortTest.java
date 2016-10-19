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
public class InsertionSortTest {
    
    int[] array = new int[1000];
    
    public InsertionSortTest() {
        
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
     * Test of InsertionSortM method, of class InsertionSort.
     */
    @Test
    public void testInsertionSortM() {
        System.out.println("InsertionSort aplicado");
        InsertionSort instance = new InsertionSort(array);
        //instance.paint();
    }
    
}
