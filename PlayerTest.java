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

public class PlayerTest {

    @Test
    public void testPlayerClass() {
        
        System.out.println("\n***** PLAYER CLASS TESTING: *****\n");
        
        // CREATE OBJECTS
        Card card1 = new Card(Card.Face.FIVE, Card.Suit.HEART);
        Card card2 = new Card(Card.Face.QUEEN, Card.Suit.DIAMOND);
        Player player = new Player();
        
        // TEST acceptCard() -- ADD CARDS
        player.acceptCard(card1);
        player.acceptCard(card2);
        
        // TEST makeBet()
        int testMakeBet = player.makeBet();
        System.out.println(testMakeBet);
        assertEquals(testMakeBet, 10);
        
        // TEST doubleDownBet()
        player.currentBet = 30;
        int testdoubleDownBet = player.doubleDownBet();
        System.out.println(testdoubleDownBet);
        assertEquals(testdoubleDownBet, 60);
    
        if (testMakeBet >= testdoubleDownBet)
            System.out.println("\nBUG ALERT!\n");
        
        // TEST makeInsuranceBet()
        player.currentInsurance = 10;
        System.out.println(player.makeInsuranceBet());
        assertEquals(player.makeInsuranceBet(), 10);
   
        // TEST getAction()
        System.out.println(player.getAction());
        assertEquals(player.getAction(), player.getAction());
        
        // TEST getHand()
        System.out.println(player.getHand());
        assertEquals(player.getHand(), player.currentHand);
        
        // TEST getCurrentBet()
        System.out.println(player.getCurrentBet());
        assertEquals(player.getCurrentBet(), 60);
        
        // TEST moveMoneyToInsurance() & moveMoneyToBet()
        player.currentWallet = 100;
        player.moveMoneyToInsurance(90);
        player.moveMoneyToBet(5);

        // TEST toString()
        System.out.println(player.toString());
        
        // TEST acceptMoney()
        player.currentWallet = 50;
        player.acceptMoney(10);
        
        // TEST nextHand()
        player.nextHand();
        System.out.println("\n");
       
    }
}

*/






