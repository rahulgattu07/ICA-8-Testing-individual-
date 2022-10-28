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
        assertEquals(false, Urinals.goodString("110"));
    }
}