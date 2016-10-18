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
public class MergeSortTest {
    
    public MergeSortTest() {
    }

    /**
     * Test of MergeSortM method, of class MergeSort.
     */
    @Test
    public void testMergeSortM() {
        System.out.println("MergeSortM");
        int[] array={4,6,102,1,5,74,28,12,11,7};
        int izq = 0;
        int der = array.length-1;
        MergeSort instance = new MergeSort(array);
        instance.MergeSortM(array, izq, der);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Merge method, of class MergeSort.
     */
    @Test
    public void testMerge() {
        System.out.println("Merge");
        int[] array ={4,6,102,1,5,74,28,12,11,7};
        int izq = 0;
        int der = array.length-1;
        int m = (izq+der)/2;
        MergeSort instance = new MergeSort(array);
        instance.Merge(array, m, izq, der);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of paint method, of class MergeSort.
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        int[] array ={4,6,102,1,5,74,28,12,11,7};
        MergeSort instance = new MergeSort(array) ;
        instance.paint();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
