package org.pemrogramanlanjut.tugas.ClassesandObjects;

public class referencetypes {
    public static void main(String[ ] args) {
        String p;
        p = new String();
        p.substring(25);
        change(p);
        System.out.println(p.substring(25));
    }
    static void change(String p) {
        p.substring(10);
    }
}
