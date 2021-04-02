package org.pemrogramanlanjut.tugas.ExceptionsListsThreadsandFiles;

class B implements Runnable{
    public void run() {

        System.out.println("B4");
    }
}
class A4 extends Thread {
    public void run() {

        System.out.println("A11");
        Thread t = new Thread(new B());
        t.start();
    }
    public static void main(String[ ] args) {
        A4 object = new A4();
        object.start();
    }
}

