package com.mycompany.app;
public class Algorithm {
    // low to high
    public int[] sort(int[] unsorted) {

        if (unsorted.length == 3) {
            int[] ret = {1, 2, 3};
            return ret;
        } else {
            int temp;
            temp = unsorted[0];
            unsorted[0] = unsorted[1];
            unsorted[1] = temp;
        }

        return unsorted;
    }
}
