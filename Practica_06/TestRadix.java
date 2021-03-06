package com.myprograms.algorithms.sorting;
import org.junit.Test;

public class TestRadix {

    public void sort() {
        int[] unsorted = {5, 3, 4, 2, 1};
        int[] sorted = {1, 2, 3, 4, 5};
        RadixSort.sort(unsorted);
        assertArrayEquals("Radix sort is not working", sorted, unsorted);
    }
}