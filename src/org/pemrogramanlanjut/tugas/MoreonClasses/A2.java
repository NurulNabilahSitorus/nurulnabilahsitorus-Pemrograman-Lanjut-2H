package org.pemrogramanlanjut.tugas.MoreonClasses;

public class A2 {
    public void print() {
        System.out.println("A");
    }
}
class B2 extends A2 {
    public void print() {
        System.out.println("B");
    }
    public static void main(String[ ] args) {
        A2 object = new B2();
        B2 b = (B2) object;
        b.print();
    }
}
