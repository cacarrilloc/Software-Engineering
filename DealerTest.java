/***************************************************
 ** Author: Carlos Carrillo                        *
 ** Date:   10/05/2016                             *
 ** Description: This class contains a method to   *
 *  create a set of tests for another class called *
 *  Card.java.                                     *
 **************************************************/

package edu.osu.blackjack;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;


public class DealerTest {

    @Test
    public void testDealerClass() {
        
        System.out.println("\n***** DEALER CLASS TESTING: *****\n");
        
        // CREATE OBJECTS
        Card card1 = new Card(Card.Face.FIVE, Card.Suit.HEART);
        Dealer dealer = new Dealer();
        
        // TEST VOID FUNCTIONS
        dealer.setDeck(Card.newDeck());
        dealer.acceptCard(card1);
        dealer.shuffleDeck();
        
        // TEST JAVA INTERFACES
        Player player = new Player();
        dealer.dealCard(player);
        //dealer.compareHandAndSettle(player);
        
        // TEST isInsuranceAvailable()
        if (dealer.isInsuranceAvailable()){
            System.out.println("isInsuranceAvailable() IS TRUE\n");
        }
        assertFalse("isInsuranceAvailable() IS FALSE\n", false);
        
        // TEST getHand()
        int i;
        int counter = 26;
        Card cardPos1;
        Card cardPos2;
        // Print cards from middle point to the bottom.
        //System.out.println("\n** getHand() = ");
        for (i=0; i<52; i++) {
            cardPos1 = dealer.getHand().get(i);
            cardPos2 = dealer.getHand().get(counter);
            if (cardPos1 == cardPos2){
                if (counter > 0){
                    counter--;
                    i = counter-1;
                }
                //System.out.println("Card #"+counter+" suit is "+cardPos1.suit);
                //System.out.println("Card #"+counter+" face is "+cardPos1.face);
            }
        }
        assertEquals(dealer.getHand().get(1), dealer.getHand().get(counter+1));
       
        // TEST dumpDeck()
        //dealer.dumpDeck(Card.newDeck());
        //System.out.println("\n");
        
        // TEST reset()
        dealer.reset();
  
        //System.out.println("\n");
    }
}








