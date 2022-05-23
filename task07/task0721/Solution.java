package pl.codegym.task.task07.task0721;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Minimum i maksimum w tablicach
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        //tutaj wpisz swój kod

       int[] tab = new int[20];

       for ( int i = 0; i < tab.length; i++){
           tab[i]=Integer.parseInt(reader.readLine());
       }
       int minimum = tab[0];
       int maksimum = tab[0];


        for (int i = 1; i < tab.length; i++){

            if ( tab[i] < minimum){
                minimum = tab[i];
            }
            if(tab[i]>maksimum){
                maksimum = tab[i];
            }

        }










        System.out.print(maksimum + " " + minimum);
    }
}
