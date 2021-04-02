package org.pemrogramanlanjut.tugas.MoreonClasses;

abstract class animal2 {
    public int age;
    public abstract int printAge();
}
class Dog2 extends animal2 {
    public int printAge() {

        return age;
    }
}
