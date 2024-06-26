package com.qa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account act;

    @BeforeEach
    void setUp() {
//create an account
        act = new Account(new String[]{"Link", "Visa"}, "80-10-01", "12345678", "1234"),
    }

    @Test
    @DisplayName("Match Accounts")
    void compareTo() {

        Account inputObject = new Account(new String[]{"Link"}, "80-10-01", "12345678", "1234");
        assertEquals(0,act.compareTo(inputObject), "Login Failed");
    }
}