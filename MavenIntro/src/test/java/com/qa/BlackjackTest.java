package com.qa;

import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class BlackjackTest {

    Blackjack blackjack = new Blackjack();

    @Test
    public void handOneZeroHandTwoZero(){

        assertEquals(0, blackjack.play(1, 0));
    }


}
