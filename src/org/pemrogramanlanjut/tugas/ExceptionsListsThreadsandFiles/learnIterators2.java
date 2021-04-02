package org.pemrogramanlanjut.tugas.ExceptionsListsThreadsandFiles;

import java.util.Iterator;
import java.util.LinkedList;

public class learnIterators2 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer> it = list.iterator();
        while (it. hasNext()) {
            System.out.println(it.next());
        }
    }
}
