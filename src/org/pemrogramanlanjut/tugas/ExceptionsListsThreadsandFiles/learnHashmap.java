package org.pemrogramanlanjut.tugas.ExceptionsListsThreadsandFiles;
import java.util.HashMap;

public class learnHashmap {
    public static void main(String[] args) {
        HashMap<String, String> m = new HashMap<String, String>();

        m.put("A", "First");
        m.put("B", "Second");

        System.out.println(m.get("B"));
    }
}
