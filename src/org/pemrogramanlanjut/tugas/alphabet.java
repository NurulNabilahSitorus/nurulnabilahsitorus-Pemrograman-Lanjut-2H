package org.pemrogramanlanjut.tugas;

class alphabet {
    public void doSomething() {

        System.out.println("A");
    }
    public void doSomething(String str) {

        System.out.println(str);
    }
}
class alphabet2 {
    public static void main(String[ ] args) {

        alphabet object = new alphabet();
        object.doSomething("B");
    }
}
