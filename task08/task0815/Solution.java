package pl.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


/* 
Spis ludności
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {
        //tutaj wpisz swój kod
        HashMap<String,String> lista = new HashMap<>();

        lista.put("Kaczmarek","Wiktor");
        lista.put("Kowalczyk","Maciek");
        lista.put("Bartosik","Bartek");
        lista.put("Kaczmarekr","Alojzy");
        lista.put("Bartosikt","Bartek");
        lista.put("Jedrzejewski","Patryk");
        lista.put("Mikołajczyk","Wiktor");
        lista.put("Kowalczyky","Kacper");
        lista.put("Sralala","Mikołaj");
        lista.put("Alalal","Arman");
        return lista;



    }

    public static int getLicznikTakichSamychImion(HashMap<String, String> map, String imie) {
        //tutaj wpisz swój kod
        int licznik =0;
        for(String x :map.values()){
            if(x.equals(imie)){
                licznik++;
            }
        }
        return licznik;
    }

    public static int getLicznikTakichSamychNazwisk(HashMap<String, String> map, String nazwisko) {
        //tutaj wpisz swój kod
        int licznik =0;
        for(String b : map.keySet()){
            if(b.equals(nazwisko)){
                licznik++;
            }
        }
        return licznik;


    }

    public static void main(String[] args) {
        utworzMap();

    }
}
