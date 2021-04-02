package org.pemrogramanlanjut.tugas.Arrays;
import java.util.Scanner;

public class reverseastring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
