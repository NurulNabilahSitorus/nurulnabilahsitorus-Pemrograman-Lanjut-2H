package org.pemrogramanlanjut.tugas.MoreonClasses;

class A5 {
    private void print() {
        System.out.println("a");
    }
    private void print(String str) {
        System.out.println("b");
    }
    private void print(int x) {
        System.out.println("c");
    }
    public static void main(String[ ] args) {
        A5 object = new A5();
        object.print(12);
    }
}
