package pl.codegym.task.task04.task0414;

/* 
Liczba dni w roku
*/

import java.io.*;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String s = reader.readLine();
        int rok = Integer.parseInt(s);
        if(rok%400==00){
            int a = 366;
            System.out.println("Liczba dni w roku: "+a);
        }
        else if(rok%100==0){
            int a =365;
            System.out.println("Liczba dni w roku: "+a);
        }
        else if(rok%4==0){
            int a = 366;
            System.out.println("Liczba dni w roku: "+a);
        }
        else {
            int a = 365;
            System.out.println("Liczba dni w roku: "+a);
        }
        
        
        
        
    }
}