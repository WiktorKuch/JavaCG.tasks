package pl.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Współdzielone nazwiska i imiona
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> mapa = utworzMapLudzi();
        printMapLudzi(mapa);
    }

    public static Map<String, String> utworzMapLudzi() {
        //tutaj wpisz swój kod
        HashMap<String,String>  listaLudzi = new HashMap<String,String>();
        listaLudzi.put("Kaczmarek","Marcin");
        listaLudzi.put("Bartosik","Bartek");
        listaLudzi.put("Kazimierczak","Patryk");
        listaLudzi.put("Bartosik","Kacper");
        listaLudzi.put("Plesiak","Lucjan");
        listaLudzi.put("Kaczmarek","Marcin");
        listaLudzi.put("Andrychow","Bartek");
        listaLudzi.put("Pawlak","Patryk");
        listaLudzi.put("Maciejewski","Bartek");
        listaLudzi.put("Babol","Patryk");

        return listaLudzi;
    }

    public static void printMapLudzi(Map<String, String> mapa) {
        for (Map.Entry<String, String> s : mapa.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
