package org.pemrogramanlanjut.tugas.ConditionalandLoops;
import java.util.Scanner;

public class loancalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        int payment = (amount * 271)/1000;
        int remaining = (amount - payment);
        System.out.println(remaining);
    }
}
