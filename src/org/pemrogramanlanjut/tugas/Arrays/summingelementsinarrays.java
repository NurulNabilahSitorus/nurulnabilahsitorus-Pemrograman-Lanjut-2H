package org.pemrogramanlanjut.tugas.Arrays;

public class summingelementsinarrays {
    public static void main(String[] args) {
        double sum = 0.0;
        int[] myArr = new int[4];

        for (int x = 0; x < myArr.length; x++) {
            sum += myArr[x];
        }
        System.out.println(sum);
    }
}
