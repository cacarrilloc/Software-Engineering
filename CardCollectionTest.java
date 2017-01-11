/***************************************************
 ** Author: Carlos Carrillo                        *
 ** Date:   10/05/2016                             *
 ** Description: This class contains a method to   *
 *  create a set of tests for another class called *
 *  CardCollection.java.                           *
 **************************************************/

package edu.osu.cs362;

import static org.junit.Assert.*;
import org.junit.Test;


public class CardCollectionTest {
    
    @Test
    public void testCardCollectionClass() {
        
        System.out.println("\n\n****** PART 2 (CARD FUNCTIONS TESTS) ******\n");
        System.out.println("\n*** CARD-COLLECTION CLASS TESTING: ***\n");
        
        //CREATE COLLECTION #1 USING CardCollection(Card ... init).
        CardCollection collec1 = new CardCollection();
        
        //CREATE AND ADD CARD #1 TO THE COLLECTION USING add(Card c).
        Card newCard1 = new Card(Card.Face.JACK, Card.Suit.DIAMOND);
        collec1.add(newCard1);
        
        //CREATE AND ADD CARD #1 TO THE COLLECTION USING add(Card c).
        Card newCard2 = new Card(Card.Face.QUEEN, Card.Suit.HEART);
        collec1.add(newCard2);
        
        //TEST IF add(Card c) ADDS CARDS TO COLLECTION AND TEST getCards().
        Card cardPos1 = collec1.getCards().get(0);
        Card cardPos2 = collec1.getCards().get(1);
        System.out.println(cardPos1 + " has been added."); //Print card #1
        System.out.println(cardPos2 + " has been added."); //Print card #2
        assertEquals(newCard1, cardPos1);
        assertEquals(newCard2, cardPos2);
        
        //TEST IF CARDS CAN BE DISCARDED FROM COLLECTION USING discardCard(pos).
        Card discardedCard = collec1.discardCard(0);
        System.out.println(discardedCard + " has been discarded.\n"); //Print discarded card
        cardPos1 = collec1.getCards().get(0); //Save the card that is now in cardArray(0)
        assertEquals(cardPos1, cardPos2);
 
        //CREATE COLLECTION #2
        CardCollection collec2 = new CardCollection();
 
        //TEST IF add(List<Card> c) CORRECTLY ADDS A DECK TO A NEW COLLECTION.
        int i;
        int j;
        int counter;
        boolean checkRepeatedCards = true;
        
        collec2.add(Card.newDeck()); //Add actual deck.
        
        //CHECK THERE IS NO REPEATED CARDS INTO THE DECK OF CARDS JUST ADDED.
        for (i=0; i<52; i++) {
            counter = i+1;
            cardPos1 = collec2.getCards().get(i);
            System.out.println("position "+counter+") "+cardPos1);
            
            for (j=i+1; j<52; j++) {
                cardPos2 = collec2.getCards().get(j);
                if (cardPos1 == cardPos2) {
                    checkRepeatedCards = false;
                }
            }
        }
        assertTrue(checkRepeatedCards);
        
        System.out.println("\n");
        
        //TEST IF discardCard(Pos) CORRECTLY REMOVE CARDS FROM THE DECK.
        //Remove cards from a random place in the deck
        collec2.discardCard(2);
        collec2.discardCard(4);
        collec2.discardCard(6);
        collec2.discardCard(11);
        collec2.discardCard(13);
        collec2.discardCard(17);
        collec2.discardCard(21);
        
        //Add all deck back via method add(Card c)
        for (i=0; i<52; i++) {
            counter = i+1;
            cardPos1 = collec2.getCards().get(i);
            collec2.add(cardPos1);
            System.out.println("position "+counter+") "+cardPos1);
        }
        System.out.println("\n");
    }
}








