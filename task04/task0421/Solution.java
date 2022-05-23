package pl.codegym.task.task04.task0421;

/* 
Jola czy Jola?
*/
import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String  imie1 = scanner.nextLine();
        String imie2 = scanner.nextLine();
        
        int dł1 = imie1.length();
        int dł2 = imie2.length();
        
        if ( imie1.equals(imie2))
        System.out.println("Imiona są identyczne");
        else if (imie1 != imie2 && dł1==dł2 ) 
        System.out.println("Imiona są takiej samej długości");
        
        
        
        
    
        
        
        
    }
}
