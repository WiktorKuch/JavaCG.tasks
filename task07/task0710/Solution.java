package pl.codegym.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Na szczycie listy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        ArrayList<String> lista = new ArrayList<String>();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        
        
        for ( int i=0; i<10; i++){
            String s =reader.readLine();
            lista.add(0,s);
        }
        for ( int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
        
        
    }
}
