package pl.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Koniec
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String>  lista = new ArrayList<String>();


       for(int i = 0; ; i++){
           String s = reader.readLine();
           if (!(s.equals("koniec"))){
               lista.add(s);
           }
           else {
               break;
           }
        }

        for( int i = 0;i < lista.size();i++ ) {
            System.out.println(lista.get(i));
        }

        //tutaj wpisz swój kod
    }
}