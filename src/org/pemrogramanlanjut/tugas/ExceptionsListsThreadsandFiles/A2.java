package org.pemrogramanlanjut.tugas.ExceptionsListsThreadsandFiles;

import org.pemrogramanlanjut.tugas.ExceptionsListsThreadsandFiles.A2;

class A2 implements Runnable{
    public void run() {
        System.out.println("Bye");
    }

}
class App {
    public static void main(String[] args) {
        Thread ob = new Thread(new A2());
        ob.start();
    }
}






