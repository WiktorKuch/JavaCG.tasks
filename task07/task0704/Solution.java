package pl.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Odwróć tablicę
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        
        int[] liczby = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0; i<liczby.length; i++){
            String s=reader.readLine();
            liczby[i]=Integer.parseInt(s);
           
        }
        
        for(int i= liczby.length-1;i>=0; i--)
        System.out.println(liczby[i]);
        
        
    }
    
}

