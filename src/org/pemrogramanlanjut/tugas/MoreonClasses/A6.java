package org.pemrogramanlanjut.tugas.MoreonClasses;

class A6 {
    public void doSomething() {
        System.out.println("A6");
    }
    public void doSomething(String str) {
        System.out.println(str);
    }
}
class B {
    public static void main(String[] args) {
        A6 object = new A6();
        object.doSomething(" B ");
    }
}
