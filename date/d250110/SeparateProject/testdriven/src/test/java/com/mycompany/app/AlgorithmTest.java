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
        assertArrayEquals(array, algorithm.sort(array));
    }

    @Test
    public void single() {
        var algorithm = new Algorithm();

        int[] array = {1};
        assertArrayEquals(array, algorithm.sort(array));
    }

    @Test
    public void two() {
        var algorithm = new Algorithm();

        int[] input = {2, 1};
        int[] output = {1, 2};
        assertArrayEquals(output, algorithm.sort(input));
    }

    @Test
    public void threeInts() {
        var algorithm = new Algorithm();

        int[] input = {3, 2, 1};
        int[] output = {1, 2, 3};
        assertArrayEquals(output, algorithm.sort(input));
    }

}
