package pl.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Numer miesiąca
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String p = reader.readLine();


        HashMap<Integer,String> lista = new HashMap<Integer,String>();
        lista.put(1,"Styczeń");
        lista.put(2,"Luty");
        lista.put(3,"Marzec");
        lista.put(4,"Kwiecień");
        lista.put(5,"Maj");
        lista.put(6,"Czerwiec");
        lista.put(7,"Lipiec");
        lista.put(8,"Sierpień");
        lista.put(9,"Wrzesień");
        lista.put(10,"Październik");
        lista.put(11,"Listopad");
        lista.put(12,"Grudzień");

       for(Map.Entry<Integer,String> tabela : lista.entrySet()){
           if(tabela.getValue().equals(p)){
               System.out.println(tabela.getValue()+" to miesiąc nr "+tabela.getKey());
           }
        }

    }
}
