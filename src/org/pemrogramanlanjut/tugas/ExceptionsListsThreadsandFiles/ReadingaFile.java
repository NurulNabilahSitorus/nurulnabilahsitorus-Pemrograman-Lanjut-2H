package org.pemrogramanlanjut.tugas.ExceptionsListsThreadsandFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingaFile {
    public static void main(String[] args) {
        try {
            File f = new File("a.txt");
            Scanner sc = new Scanner(f);

            while (sc.hasNext()) {
                String a = sc.next();
                String b = sc.next();
                System.out.println(a + " " + b);
            }

            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
