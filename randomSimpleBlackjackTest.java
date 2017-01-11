/****************************************************
 ** Author: Carlos Carrillo                         *
 ** Date:   11/09/2016                              *
 ** Description: This class contains a Random       *
 *  Oracle tests to test playRound via assertions   *
 ***************************************************/

package edu.osu.blackjack;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
import static org.mockito.Mockito.*;

public class randomSimpleBlackjackTest  {
    
    
    int N_RANDOM_TEST = 100;
    Random r = new Random(); // Create a new Random number generator
    
    
    @Test
    public void randomBlackjackTestOracle() {
  
        // Create objects.
        Dealer dealer = new Dealer();
        Player player = new Player();
        DealerAction dt = mock(DealerAction.class);
        PlayerAction pa = mock(PlayerAction.class);
    
        
        for (int i=0; i<N_RANDOM_TEST; i++) {
         
            // Set dealer with a random deck
            dealer.setDeck(Card.newDeck());
            dealer.shuffleDeck();
         
            // Set an empty dealerHand
            dealer.reset();
         
            // Set player with a random currentWallet
            player.currentWallet = r.nextInt(3000);
         
            // Checks if the player has an empty currentHand
            assertEquals(player.getHand(), player.currentHand);
      
            int val = r.nextInt(4);
            switch (val) {
                
                // PLAYER 1
                case 0:
                    //  This player is very confident and doubles down. However, if
                    //  the player hits twice after doubling, a error "Wanted 4 times;
                    //  but was 3 times" will be generated since he can only get one
                    //  more card after doubling down according to the rules of the game.
                    when(pa.getAction()).thenReturn(PlayerAction.ActionType.HIT)
                                        .thenReturn(PlayerAction.ActionType.DOUBLE)
                                        .thenReturn(PlayerAction.ActionType.HIT);
                    
                    // Checks if the player's hand is equal to his currentHand
                    assertEquals(player.getHand(), player.currentHand);
                    break;
                
                // PLAYER 2
                case 1:
                    //  This player doubles down without even receiving his first card!
                    //  This action is obviously not allowed by the game rules.
                    //  BUG FOUND: Even though this is action against the game rules,
                    //  it passes the test and the BUILD SUCCESS.
                    //  Thus SimpleBlackjack.java was modified to eliminate this bug.
                    when(pa.getAction()).thenReturn(PlayerAction.ActionType.DOUBLE);
                    
                    // Checks if the player's hand is equal to his currentHand
                    assertEquals(player.getHand(), player.currentHand);
                    break;
                 
                // PLAYER 3
                case 2:
                    //  This player stands without even receiving his first card!
                    //  This action is obviously not allowed by the game rules.
                    //  BUG FOUND: Even though this action is against the game rules,
                    //  it passes the test and the BUILD SUCCESS.
                    //  Thus SimpleBlackjack.java was modified to eliminate this bug.
                    when(pa.getAction()).thenReturn(PlayerAction.ActionType.STAND);
                    
                    // Checks if the player's hand is equal to his currentHand
                    assertEquals(player.getHand(), player.currentHand);
                    break;
                 
                // PLAYER 4
                case 3:
                    //  This player NEVER stands (which is actually).
                    //  BUG FOUND: The program crashes when the STAND action is not found,
                    //  so TEST takes a lot longer than usual before throwing and error.
                    //  Thus SimpleBlackjack.java was modified to eliminate this bug.
                    when(pa.getAction()).thenReturn(PlayerAction.ActionType.HIT)
                                        .thenReturn(PlayerAction.ActionType.HIT)
                                        .thenReturn(PlayerAction.ActionType.HIT)
                                        .thenReturn(PlayerAction.ActionType.HIT)
                                        .thenReturn(PlayerAction.ActionType.HIT);
                    
                    // Checks if the player's hand is equal to his currentHand
                    assertEquals(player.getHand(), player.currentHand);
                    break;
            }
        }
        SimpleBlackjack j = new SimpleBlackjack(dt, new PlayerAction[]{pa});
        j.playRound();
    }
}













