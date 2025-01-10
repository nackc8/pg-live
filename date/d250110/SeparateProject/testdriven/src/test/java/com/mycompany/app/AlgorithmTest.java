package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
// Test driven development
//
// Red: Gör ett test som misslyckas!
// Green: Gör en MINIMAL ändring för att få det att lyckas
// Refactor: Ändra om koden så den blir tydligare/enklare

public class AlgorithmTest {

    @Test
    public void empty() {
        var algorithm = new Algorithm();

        int[] array = {};
        assertArrayEquals(algorithm.sort(array));
    }
}
