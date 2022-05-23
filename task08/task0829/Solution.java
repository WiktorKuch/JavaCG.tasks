package pl.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Aktualizacja oprogramowania
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String miasto;
String nazwisko;

        // Lista adresów
        HashMap<String,String> rodziny = new HashMap<String,String>();
        while(true){
            miasto = reader.readLine();
            if(miasto.isEmpty()){
                break;
            }
            nazwisko=reader.readLine();
            rodziny.put(miasto,nazwisko);
        }
        String s = reader.readLine();

        // Wczytuje numer domu
       for(Map.Entry<String,String> lista : rodziny.entrySet()){
           if(s.equals(lista.getKey())){
               System.out.println(lista.getValue());
           }
       }
    }
}
