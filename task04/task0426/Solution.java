package pl.codegym.task.task04.task0426;

/* 
Etykiety i liczby
*/
import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));                                                  
    String liczbaa = bufferedReader.readLine();                                                  
    int a = Integer.parseInt(liczbaa);                                                   
                                                      
    if (a < 0 && a % 2 == 0)                                                  
        System.out.println("Ujemna liczba parzysta");                                                  
    if (a < 0 && a % 2 != 0)                                                           
        System.out.println("Ujemna liczba nieparzysta");                                                  
    if (a == 0)                                                  
        System.out.println("Zero");                                                  
    if (a > 0 && a % 2 == 0)                                                  
        System.out.println("Dodatnia liczba parzysta");                                                  
    if (a > 0 && a % 2 != 0)                                                           
        System.out.println("Dodatnia liczba nieparzysta");                                                  
                                                                                    
    }                               
    
    }

