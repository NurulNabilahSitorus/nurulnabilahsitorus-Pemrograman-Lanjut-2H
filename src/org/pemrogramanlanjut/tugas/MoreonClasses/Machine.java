package org.pemrogramanlanjut.tugas.MoreonClasses;

class Machine {
    public void start() {
        System.out.println(" Hello ");
    }


    public static void main(String[] args) {
        Machine m1 = new Machine() {
            @Override
            public void start() {
                System.out.println(" Hi ");
            }
        };
        Machine m2 = new Machine();
        m2.start();
    }
}
