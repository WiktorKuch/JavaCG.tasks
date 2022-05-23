package pl.codegym.task.task08.task0801;

/* 
HashSet roślin
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        
        HashSet<String> lista = new HashSet<String>();
        
        lista.add("arbuz");
        lista.add("banan");
        lista.add("wiśnia");
        lista.add("gruszka");
        lista.add("kantalupa");
        lista.add("jeżyna");
        lista.add("żeńszeń");
        lista.add("truskawka");
        lista.add("irys");
        lista.add("ziemniak");

        for(String tekst : lista){
            System.out.println(tekst);
        }



    }
    
}
