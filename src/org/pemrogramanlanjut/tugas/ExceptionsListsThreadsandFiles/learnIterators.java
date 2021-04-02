package org.pemrogramanlanjut.tugas.ExceptionsListsThreadsandFiles;
import java.util.ArrayList;
import java.util.Iterator;

public class learnIterators {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        Iterator<Integer> it = list.iterator();
        it.next();
        System.out.println(it.next());
    }
}
