package pl.codegym.task.task04.task0415;

/* 
Zasada trójkąta
*/
import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner liczba1 = new Scanner(System.in);
        int a = liczba1.nextInt();
         Scanner liczba2 = new Scanner(System.in);
        int b = liczba2.nextInt();
         Scanner liczba3 = new Scanner(System.in);
        int c = liczba3.nextInt();
        
        if(a+b>c && a+c>b && c+b>a){
         System.out.println("Da się zbudować trójkąt.");}
         
        else{ System.out.println("Nie da się zbudować trójkąta.");}
    }
}