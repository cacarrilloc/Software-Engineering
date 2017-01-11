/***************************************************
 ** Author: Carlos Carrillo                        *
 ** Date:   11/09/2016                             *
 ** Description: This class contains a method to   *
 *  create an oracle tests for a Random testing    *
 *  sort implementation.                           *
 **************************************************/

package edu.osu.sort;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class SortOracle  {
    public static boolean isSorted(List<Integer> original, List<Integer> sorted){
	   /*
	   Determines whether `sorted` is a sorted (ascending) version
	   of `original` by sorting original with a known good
	   implementation. This method should ***not*** mutate sorted

	   @param   original  a list of integers 
	   @param   sorted    a (possibly sorted) list of integers  
	   @returns      True if the list is sorted in ascending order
	   */
        
        // Copy the original array before sorting it
        List<Integer> originalCopy = new ArrayList(original);
        
        // Sort the copy of the original array
        Collections.sort(originalCopy);
        
    //System.out.println("Original contains: "+originalCopy.toString());
    //System.out.println("Sorted contains: "+sorted.toString());
     
        boolean door = true;
        
        for (int i=0; i < originalCopy.size(); i++) {
            if (originalCopy.get(i).equals(sorted.get(i)))
                door = true;
            else {
                door = false;
                break;
            }
        }

        if (door) {
            return true;
        }
        else {
            return false;
        }
    }
}


