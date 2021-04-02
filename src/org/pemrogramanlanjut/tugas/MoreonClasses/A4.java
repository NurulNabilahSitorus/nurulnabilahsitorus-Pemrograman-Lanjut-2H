package org.pemrogramanlanjut.tugas.MoreonClasses;

public class A4 {
    private int x;
    public boolean equals(Object o) {
        return ((A4)o).x == this.x;
    }
    public static void main(String[ ] args)  {
        A4 a = new A4();
        a.x = 9;
        A4 b = new A4();
        b.x = 5;
        System.out.println(a. equals (b));
    }
}
