package org.pemrogramanlanjut.tugas.ConditionalandLoops;

public class nestedifstatement {
    public static void main(String[] args) {
        int x = 37;
        if (x > 22) {
            if (x > 31) {
                System.out.println("it works!");
            }
            else {
                System.out.println("not works!");
            }
        }
        else {
            System.out.println("default");
        }
    }
}
