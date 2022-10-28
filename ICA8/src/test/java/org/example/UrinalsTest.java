package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrinalsTest {

    @Test
    void main() {
    }

    @Test
    void goodString() {

        System.out.println("====== Rahul Gattu == TEST ONE EXECUTED =======");
        assertEquals(false, Urinals.goodString("abc"));
    }

    @Test
    void getUrinals()
    {
        assertEquals(1,Urinals.getUrinals("10001"));
        assertEquals(0,Urinals.getUrinals("1001"));
        assertEquals(3,Urinals.getUrinals("00000"));
        assertEquals(2,Urinals.getUrinals("0000"));
        assertEquals(1,Urinals.getUrinals("01000"));
        assertEquals(-1,Urinals.getUrinals("011"));
    }
}