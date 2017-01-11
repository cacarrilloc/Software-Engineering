/****************************************************
 ** Author: Carlos Carrillo                         *
 ** Date:   11/09/2016                              *
 ** Description: This class contains several Random *
 *  Oracle tests for a sort implementation          *
 ***************************************************/

package edu.osu.sort;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class SortTest  {

    int N_RANDOM_TEST = 100;
    int N_ELEMENTS = 20;
    int ELEMENT_UBOUND = 100;
    
    Random r = new Random(); // Create a new Random number generator
    
    public List<Integer> generateRandomList(int length, int lbound, int ubound){
        
        List<Integer> li = new ArrayList<Integer>();
        for (int i=0; i<length; i++) {
            int rv = r.nextInt(ubound - lbound) + lbound;
            li.add(rv);
        }
        return li;
    }
    
    
    @Test
    public void randomTestOracle() {
        
        for (int i=0; i<N_RANDOM_TEST; i++) {
            // Generate a random list of size 50
            List<Integer> sorted = generateRandomList(N_ELEMENTS,0,ELEMENT_UBOUND);
            
            // Copy the original list before sorting it
            List<Integer> original = new ArrayList(sorted);
            
            // Sort original list
            Sort.sort(sorted);
            //System.out.println("sorted contains: "+sorted.toString());
                        
            // Test the result
            assertTrue(SortOracle.isSorted(original,sorted));
        }
    }

    
    @Test
    public void randomTestAssertion() {
        
        // 1) Test if the list contains the same number of
        // elements before and after the sort.
        
        // Generate a random list of size 50
        List<Integer> mainList = generateRandomList(N_ELEMENTS,0,ELEMENT_UBOUND);
        int elementsBefore = mainList.size(); //number of elements before
        
        // Sort mainList list
        Sort.sort(mainList);
        int elementsAfter = mainList.size(); //number of elements after
        
        // Test the result
        assertEquals(elementsBefore, elementsAfter);
        
        
        // 2) Test if index 8 is less than index 10.
        boolean lessIndicator = true;
        
        if(mainList.get(8) < mainList.get(10))
            lessIndicator = true;
        else
            lessIndicator = false;
        
        // Test the result
        assertTrue(lessIndicator);
        
        
        // 3) Test if the last element is the largest in the array.
        int largest = mainList.size() - 1;
        
        for (int i=0; i<largest; i++) {
            if(mainList.get(largest) < mainList.get(i))
                lessIndicator = false;
            else
                lessIndicator = true;
        }
        // Test the result
        assertTrue(lessIndicator);
        
        // 4) Test if the first element is the smallest in the array.
        int smallest = mainList.get(0);
        
        for (int i=1; i<mainList.size(); i++) {
            if(smallest > mainList.get(i))
                lessIndicator = false;
            else
                lessIndicator = true;
        }
        // Test the result
        assertTrue(lessIndicator);
        
        
        // 5) Test if each array element is smaller than the next up in the array.
        for (int i=0; i<mainList.size(); i++) {
            
            for (int j=i+1; i<mainList.size(); i++) {
                
                if(mainList.get(i) < mainList.get(j)) {
                    lessIndicator = false;
                    break;
                }else
                    lessIndicator = true;
            }
        }
        // Test the result
        assertTrue(lessIndicator);
         
    }
}













