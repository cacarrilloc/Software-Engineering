/*****************************************************
 ** Author: Carlos Carrillo                          *
 ** Date:   10/05/2016                               *
 ** Description: This class has 4 different methods  *
 *  to create a set of tests for each of these four  *
 *  functions located in the file WarmUp.java.       *
 *****************************************************/

package edu.osu.cs362;

import static org.junit.Assert.*;
import org.junit.Test;


public class WarmupTest  {

//////////////////////////////////////////////////////
 
    @Test
    public void testFindIntegerExample() {
        
        //int result = WarmUp.findInteger(new int[] { 1, 2, 3, 4, 5 }, 3);
        int result = WarmUp.findInteger(new int[] { 1, 2, 3, 4, 5 }, 100);
		assertEquals(result, -1);

		for (int i = 1; i < 5; i++) {
			int result2 = WarmUp.findInteger(new int[] { 1, 2, 3, 4, 5 }, i + 1);
            //int result2 = WarmUp.findInteger(new int[] { 1, 2, 3, 4, 5 }, i); //Produce test failure
			assertEquals("findInteger(new int[]{1,2,3,4,5}," + i + ")", result2, i);
		}
	}
    
//////////////////////////////////////////////////////

    @Test
    public void testLastZero() {
  
        System.out.println("\n3) LASTZERO FUNCTION TESTS:\n");
    
		//int result2 = WarmUp.lastZero(new int[] { 1, 2, 3, 4, 5 }); //Produce test failure
        int result2 = WarmUp.lastZero(new int[] { 8, 9, 1, 4, 0 });
        
        int trigger = result2;
        
        if (result2 == -1){
            trigger = 1;
            System.out.println("TEST 1: ZERO IS NOT IN THE ARRAY!!\n");
        }
        else {
            System.out.println("The index of the last occurrence of 0 is " + result2);
        }
        assertEquals(result2, trigger);
        
   
        boolean checkZero = true;
        //result2 = WarmUp.lastZero(new int[] { 1, 2, 3, 4, 5 }); //Produce test failure
        result2 = WarmUp.lastZero(new int[] { 7, 0, 3, 9, 2 });
        
        if (result2 == -1) {
            checkZero = false;
            System.out.println("\nTEST 2: ZERO IS NOT IN THE INPUT ARRAY!!\n");
        }
        else {
            System.out.println("The index of the last occurrence of 0 is " + result2);
        }
        assertTrue(checkZero);

        System.out.println("\nALL INPUTS ARE CORRECT!!\n");
    }
    
//////////////////////////////////////////////////////

    @Test
    public void testLast() {
    
        System.out.println("\n2) LAST FUNCTION TESTS:\n");
    
        //int result3 = WarmUp.last(new int[] { }, 44); //Produce test failure
        int result3 = WarmUp.last(new int[] { 8, 9, 1, 4, 0 }, 8);
        //int result3 = WarmUp.last(new int[] { 8, 9, 1, 4, 7 }, 44); //Produce test failure
        
        System.out.println("OUTPUT 1 = " + result3);
        
        int trigger2 = result3;
        
        if (result3 == -1){
            trigger2 = 1;
            System.out.println("THIS ARRAY IS NULL!!\n");
        }
        assertEquals(result3, trigger2);
        System.out.println("The index of the last occurrence of Y is " + result3);
        
        System.out.println("\nALL INPUTS ARE CORRECT!!\n");
    }

//////////////////////////////////////////////////////

    @Test
    public void testPositive() {
    
        System.out.println("\n4) POSITIVE FUNCTION TESTS:\n");
    
        int result3 = WarmUp.positive(new int[] { -8, 9, -1, 4, -6, 3 });
        //int result3 = WarmUp.positive(new int[] { -8, -9, -1, -4, -6, -3 }); //Produce test failure
        
        System.out.println("OUTPUT = " + result3);
        
        int trigger3 = result3;
        
        if (result3 == 0){
            trigger3 = 1;
            System.out.println("\nNO POSITIVE ELEMENTS FOUND, ABORT MISSION!!\n");
        }
        assertEquals(result3, trigger3);
        
        System.out.println("\nPOSITIVE ELEMENTS FOUND!!\n");
    }
    
//////////////////////////////////////////////////////

    @Test
    public void testOddOrPos() {
    
        System.out.println("\nWELCOME TO ASSIGNMENT 2\n");
        System.out.println("PART 1 (WARM UP TESTS)\n");
    
        System.out.println("\n1) ODD_OR_POS FUNCTION TESTS:\n");
    
        int result4 = WarmUp.positive(new int[] { -8, 9, -1, 4, -6, 3 });
        //int result4 = WarmUp.positive(new int[] { -8, -9, -1, -4, -7}); //Produce test failure
        //int result4 = WarmUp.positive(new int[] { 8, 9, 1, 4, 6, 3 }); //Produce test failure
        
        System.out.println("OUTPUT = " + result4);
        
        int trigger4 = result4;
        
        if (result4 == 0){
            trigger4 = 1;
            System.out.println("\nNO ODD OR POSITIVE ELEMENTS FOUND, ABORT MISSION!!\n");
        }
        assertEquals(result4, trigger4);
        
        System.out.println("\nODD OR POSITIVE ELEMENTS FOUND!!\n");
    }
}


