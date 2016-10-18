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
public class BubbleSortTest {
    
    public BubbleSortTest() {
    }

    /**
     * Test of BubbleSortM method, of class BubbleSort.
     */
    @Test
    public void testBubbleSortM() {
        System.out.println("BubbleSortM");
        int[] array = {4,6,102,1,5,74,28,12,11,7};
        BubbleSort instance = new BubbleSort(array);
        instance.BubbleSortM();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of paint method, of class BubbleSort.
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        int[] array={4,6,102,1,5,74,28,12,11,7};
        BubbleSort instance = new BubbleSort(array);
        instance.paint();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
