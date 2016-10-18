/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithmsbenchmark_tarea2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author enrique
 */
public class QuickSortTest {
    
    public QuickSortTest() {
    }

    /**
     * Test of QuickSortM method, of class QuickSort.
     */
    @Test
    public void testQuickSortM() {
        System.out.println("QuickSortM");
        int[] array ={4,6,102,1,5,74,28,12,11,7};        
        int izq = 0;
        int der = array.length-1;
        QuickSort instance = new QuickSort(array);
        instance.QuickSortM(array, izq, der);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of paint method, of class QuickSort.
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        int[] array ={4,6,102,1,5,74,28,12,11,7};
        QuickSort instance = new QuickSort(array);
        instance.paint();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
