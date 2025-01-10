package com.mycompany.app;
public class Algorithm {
    // low to high
    public int[] sort(int[] unsorted) {
        int temp;
        temp = unsorted[0];
        unsorted[0] = unsorted[1];
        unsorted[1] = temp;

        return unsorted;
    }
}
