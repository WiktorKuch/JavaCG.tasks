package pl.codegym.task.task08.task0802;

/* 
HashMap z 10 par
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        HashMap<String,String> lista = new HashMap<String,String >();
        lista.put("arbuz","melon");
        lista.put("banan","owoc");
        lista.put("wiśnia","owoc");
        lista.put("gruszka","owoc");
        lista.put("kantalupa","melon");
        lista.put("jeżyna","owoc");
        lista.put("żeńszeń","korzeń");
        lista.put("truskawka","owoc");
        lista.put("irys","kwiat");
        lista.put("ziemniak","bulwa");

       Iterator<Map.Entry<String ,String >> iterator = lista.entrySet().iterator();
       while (iterator.hasNext()){
           Map.Entry<String,String>  para = iterator.next();
           String klucz = para.getKey();
           String wartosc = para.getValue();
           System.out.println(klucz+" - "+wartosc);

        }

    }
}
