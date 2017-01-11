/***************************************************
 ** Author: Carlos Carrillo                        *
 ** Date:   10/05/2016                             *
 ** Description: This class contains a method to   *
 *  create a set of tests for another class called *
 *  Card.java.                                     *
 **************************************************/

/*
package edu.osu.blackjack;


import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class CardTest {

    @Test
    public void testCardClass() {
        
        System.out.println("\n***** CARD CLASS TESTING: *****\n");
        
        //Add card #1 to collection.
        Card card1 = new Card(Card.Face.FIVE, Card.Suit.HEART);
        Card card2 = new Card(Card.Face.FIVE, Card.Suit.HEART);
        
        //Test Face value in getter and Constructor.
        int getter1 = card1.face.getValue();
        assertEquals(getter1, 5);
        
        //Test toString() with Face.
        String string1a = card1.face.toString();
        String string1b = card2.face.toString();
        
        if (string1a == string1b)
            System.out.println(string1a); //Print Face name for testing
        else
            System.out.println("NOT EQUAL");
        
        assertEquals(string1a, string1b);
        
        //Test toString() with Suit.
        String string1c = card1.suit.toString();
        String string1d = card2.suit.toString();
        
        //Create a branch for testing purposes.
        
        if (string1c == string1d)
            System.out.println(string1c); //Print Face name for testing
        else
            System.out.println("NOT EQUAL");
        
        assertEquals(string1c, string1d);
       
        //System.out.println("\n");
        
        //Test if we can find the middle card of the deck.
        int i;
        int counter = 26;
        Card cardPos1;
        Card cardPos2;
        
        //Print cards from middle point to the bottom.
        for (i=0; i<52; i++) {
            cardPos1 = Card.newDeck().get(i);
            cardPos2 = Card.newDeck().get(counter);
            if (cardPos1 == cardPos2){
                if (counter > 0){
                    counter--;
                    i = counter-1;
                }
                //System.out.println("Card #"+counter+" suit is "+cardPos1.suit);
                //System.out.println("Card #"+counter+" face is "+cardPos1.face);
            }
        }
        assertEquals(counter, 0);
        
        // TEST isVisible() AND setVisible()
        boolean testVisible = true;
        card1.setVisible(testVisible);
        
        if (card1.isVisible()) {
            System.out.println("IT IS VISIBLE!");
        }
        
        assertFalse("IT IS NOT VISIBLE!", false);
        
        System.out.println("\n");
        
    }
}

*/






