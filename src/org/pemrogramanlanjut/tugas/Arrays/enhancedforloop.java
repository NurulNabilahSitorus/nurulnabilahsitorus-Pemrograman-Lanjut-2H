package org.pemrogramanlanjut.tugas.Arrays;

public class enhancedforloop {
    public static void main(String[] args) {
        int total = 0;
        int [] arr = new int[5];

        for(int x : arr) {
            total += x;
        }
    }
}
