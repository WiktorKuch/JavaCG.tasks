package pl.codegym.task.task04.task0422;

/* 
18+
*/
import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        String imie = scanner.nextLine();
        int wiek = scanner.nextInt();
        
        if ( wiek < 18)
        System.out.println("Podrośnij trochę");
    }
}
