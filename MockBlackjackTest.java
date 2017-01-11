/***************************************************
 ** Author: Carlos Carrillo                        *
 ** Date:   11/01/2016                             *
 ** Description: This class contains 5 mock tests  *
 *  for testing SimpleBlackjack.java.              *
 **************************************************/

package edu.osu.blackjack;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;
import static org.mockito.Mockito.*;

public class MockBlackjackTest {
    
    @Test
    public void blackJackMock1(){
        // It run without errors for a simple case.
        DealerAction dt = mock(DealerAction.class);
        PlayerAction pa = mock(PlayerAction.class);
        
        //  This player got very lucky (Blackjack!!!)
        //  No errors generated since it's within the rules.
        when(pa.getAction()).thenReturn(PlayerAction.ActionType.HIT)
                            .thenReturn(PlayerAction.ActionType.HIT)
                            .thenReturn(PlayerAction.ActionType.STAND);
        
        SimpleBlackjack j = new SimpleBlackjack(dt, new PlayerAction[]{pa});
        j.playRound();
        
        verify(dt, times(2)).dealCard(pa);
    }
    
    
    @Test
    public void blackJackMock2(){
        // It run without errors for a simple case.
        DealerAction dt = mock(DealerAction.class);
        PlayerAction pa = mock(PlayerAction.class);
        
        //  This player is very confident and doubles down. However, if
        //  the player hits twice after doubling, a error "Wanted 4 times;
        //  but was 3 times" will be generated since he can only get one
        //  more card after doubling down according to the rules of the game.
        when(pa.getAction()).thenReturn(PlayerAction.ActionType.HIT)
                            .thenReturn(PlayerAction.ActionType.DOUBLE)
                            .thenReturn(PlayerAction.ActionType.HIT);
                            //.thenReturn(PlayerAction.ActionType.HIT);
        
        SimpleBlackjack j = new SimpleBlackjack(dt, new PlayerAction[]{pa});
        j.playRound();
        
        verify(dt, times(2)).dealCard(pa);
    }
    
    
    @Test
    public void blackJackMock3(){
         // It run without errors for a simple case.
         DealerAction dt = mock(DealerAction.class);
         PlayerAction pa = mock(PlayerAction.class);
     
         //  This player doubles down without even receiving his first card!
         //  This action is obviously not allowed by the game rules.
         //  BUG FOUND: Even though this is action against the game rules,
         //  it passes the test and the BUILD SUCCESS.
         when(pa.getAction()).thenReturn(PlayerAction.ActionType.DOUBLE);
     
         SimpleBlackjack j = new SimpleBlackjack(dt, new PlayerAction[]{pa});
         j.playRound();
     
         verify(dt, times(3)).dealCard(pa);
    }
 
    @Test
    public void blackJackMock4(){
        // It run without errors for a simple case.
        DealerAction dt = mock(DealerAction.class);
        PlayerAction pa = mock(PlayerAction.class);
        
        //  This player stands without even receiving his first card!
        //  This action is obviously not allowed by the game rules.
        //  BUG FOUND: Even though this action is against the game rules,
        //  it passes the test and the BUILD SUCCESS.
        when(pa.getAction()).thenReturn(PlayerAction.ActionType.STAND);
        
        SimpleBlackjack j = new SimpleBlackjack(dt, new PlayerAction[]{pa});
        j.playRound();
        
        verify(dt, times(2)).dealCard(pa);
    }
    
    // THIS TEST HAS BEEN COMMENTED OUT IN ORDER TO AVOID THE BUG GET
    // THE PROGRAM INTO A SORT OF INFINITE LOOP.
    
    @Test
    public void blackJackMock5(){
        // It run without errors for a simple case.
        DealerAction dt = mock(DealerAction.class);
        PlayerAction pa = mock(PlayerAction.class);
        
        //  This player NEVER stands (which is actually).
        //  BUG FOUND: The program crashes when the STAND action is not found,
        //  so TEST takes a lot longer than usual before throwing and error.
        when(pa.getAction()).thenReturn(PlayerAction.ActionType.HIT)
                            .thenReturn(PlayerAction.ActionType.HIT)
                            .thenReturn(PlayerAction.ActionType.HIT)
                            .thenReturn(PlayerAction.ActionType.HIT)
                            .thenReturn(PlayerAction.ActionType.HIT);
        
        SimpleBlackjack j = new SimpleBlackjack(dt, new PlayerAction[]{pa});
        j.playRound();
        
        verify(dt, times(2)).dealCard(pa);
    }
    
}
