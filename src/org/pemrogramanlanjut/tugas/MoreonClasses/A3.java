package org.pemrogramanlanjut.tugas.MoreonClasses;

class A3 {
    private int x;
    public static void main(String[ ] args) {
        A3 a = new A3();
        a.x = 5;
        A3 b = new A3();
        b.x = 5;
        System.out.println(a == b);
    }
}
