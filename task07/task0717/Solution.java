package pl.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Duplikowanie słów
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Czyta ciągi z konsoli i deklaruje tutaj ArrayList
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         ArrayList<String> lista = new ArrayList<String>();
       for ( int i =0; i<10; i++){
           lista.add(reader.readLine());
    
        }
        ArrayList<String> wynik = doubleValues(lista);
       for ( String s : wynik){
           System.out.println(s);
       }
        // Wyświetla wynik
    }

    public static ArrayList<String> doubleValues(ArrayList<String> lista) {
        ArrayList<String> nowalista = new ArrayList<String>();
        
        for ( int i=0; i<lista.size(); i++){
            nowalista.add(lista.get(i));
            nowalista.add(lista.get(i));
            
        }
        return nowalista;
    }
}
