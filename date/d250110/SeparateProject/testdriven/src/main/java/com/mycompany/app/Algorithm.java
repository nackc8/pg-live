package com.mycompany.app;
public class Algorithm {
    // low to high
    public int[] sort(int[] unsorted) {
        int[] ret = new int[unsorted.length];

        int min = Integer.MAX_VALUE;

        for (int element : unsorted) {
            if (element < min) {
                min = element;
            }
        }

        return ret;
    }
}
