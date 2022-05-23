package pl.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Usuń i wstaw
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        
        ArrayList<String> lista = new ArrayList<String>();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
       
       for ( int i=0; i<5; i++){
           lista.add(reader.readLine());
        
        }
        for (int i=0; i<13; i++){
            
           String p = lista.get(4);
           lista.remove(4);
            lista.add(0,p);
            
        }
    for (int i=0; i<lista.size(); i++){
        System.out.println(lista.get(i));
    }
    
    
    }
}
