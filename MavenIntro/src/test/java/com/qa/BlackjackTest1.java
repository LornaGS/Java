package com.qa;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class BlackjackTest1 {

    Blackjack blackjack = new Blackjack();

    @BeforeEach
    void setUp() {
    }

    @Test
    void play() {


            TestCase.assertEquals(0, blackjack.play(1, 0));

    }
}