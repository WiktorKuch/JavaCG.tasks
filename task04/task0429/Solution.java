package pl.codegym.task.task04.task0429;

/* 
Liczby dodatnie i ujemne
*/
import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int dod = 0;
        int uj =0;
        
        if(a>0)
        dod++;
        if(a<0)
        uj++;
        if(b>0)
        dod++;
        if(b<0)
        uj++;
        if(c>0)
        dod++;
        if(c<0)
        uj++;
        
        System.out.println("Liczba liczb dodatnich:"+" "+dod);
        System.out.println("Liczba liczb ujemnych:"+" "+uj);
        
        

    }
}
