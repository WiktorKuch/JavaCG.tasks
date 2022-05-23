package pl.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Tablica z ciągami w odwrotnej kolejności
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] lista= new String[10];
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i=0; i<8; i++){
            lista[i]=reader.readLine();
            }
        for(int i=lista.length; i>=0; i--){
            System.out.println(lista[i]);
            
        }
      
    }
}