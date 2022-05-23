package pl.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Przestawiono w samą porę
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        
        ArrayList<String> lista = new ArrayList<>();
        
        
         for (int i = 0; i < N; i++ ){
             String slowaDoListy = reader.readLine();
             lista.add(slowaDoListy);
         }
         
         for ( int i = 0; i < M; i++){
             
             lista.add(lista.get(i));
         }
         
         for ( int i = 0; i < M; i++){
             
             lista.remove(lista.get(0));
         }
         
        for ( int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        //tutaj wpisz swój kod
    }
}
