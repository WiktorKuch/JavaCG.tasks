package pl.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Samotne tablice oddziałują na siebie
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        String[] tablica = new String[10];
        int[] liczby = new int[10];
        
        
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i=0; i<tablica.length; i++){
            tablica[i]=reader.readLine();
            
           
        }
        
         for (int i=0; i<liczby.length; i++){
                liczby[i]=tablica[i].length();
                System.out.println(liczby[i]);
            }
        
        
        
        
        
        
    }
}
