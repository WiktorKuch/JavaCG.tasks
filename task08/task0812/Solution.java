package pl.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Najdłuższa sekwencja
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String liczby = reader.readLine();


        ArrayList<Integer> tablica = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            int s = Integer.parseInt(reader.readLine());
            tablica.add(s);
        }

        int count =1;
       int tab[] = new int[10];
       for(int i = 1; i < 10; i++){
           if(tablica.get(i).equals(tablica.get(i-1))){
               count++;
               tab[i] = count;
           }
           else{
               tab[i] = count;
               count = 1;
           }
       }

       int max = 0;
       for(int i=0; i< 10; i++){
           if (tab[i] >= max){
               max = tab[i];
           }
       }
       System.out.println(max);

    }
}
