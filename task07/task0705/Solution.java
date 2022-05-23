package pl.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Jedna wielka tablica i dwie małe
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int[] tab20 = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int[] tab1 = new int[10];
        int[] tab2 = new int[10];
        
         for ( int i =0; i<tab20.length; i++){
            tab20[i]=Integer.parseInt(reader.readLine());
        }
        
        for(int i=0; i<tab1.length; i++){
            tab1[i]=tab20[i];
        }
        
        for(int i=0; i<tab2.length;i++){
            tab2[i]=tab20[10+i];
            System.out.println(tab2[i]);
        }
        
        
    }
}
