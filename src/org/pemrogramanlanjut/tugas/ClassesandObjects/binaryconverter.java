package org.pemrogramanlanjut.tugas.ClassesandObjects;
import java.util.Scanner;

public class binaryconverter {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(binaryconverter2.toBinary(x));
    }
}
class binaryconverter2 {
    public static String toBinary(int num) {
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
        return binary;
    }
}