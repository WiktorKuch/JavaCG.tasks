package pl.codegym.task.task04.task0425;

/* 
Target niedostępny!
*/import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b= scanner.nextInt();
        
        if (a>0 && b>0 )
        System.out.println("1");
        
        if (a<0 && b>0)
        System.out.println("2");
        
        if ( a<0 && b<0)
        System.out.println("3");
        
        if ( a>0 && b<0 )
        System.out.println("4");
    }
}
