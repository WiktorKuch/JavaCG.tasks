package pl.codegym.task.task04.task0442;


/* 
Dodawanie
*/

import java.io.*;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws Exception {
        
     //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        int suma = 0;



    while (true)
    {
        int a = scanner.nextInt();
        if ( a == - 1)
        {
         System.out.println(a + suma);
        break;
        }
        else
        {
            suma += a;
        }


    }



}
        
    }
    
  

