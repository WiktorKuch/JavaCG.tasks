package pl.codegym.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Wyświetl liczby w odwrotnej kolejności
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<Integer> zmienna = new ArrayList<>();
        for(int i= 0; i<10 ; i++){
            zmienna.add(Integer.parseInt(reader.readLine()));
            
        }
        for( int i=zmienna.size() -1; i>=0; i--){
            System.out.println(zmienna.get(i));
        }


       
    }
}
