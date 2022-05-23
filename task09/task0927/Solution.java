package pl.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Dziesięć kotów
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Kot> mapa = utworzMap();
        Set<Kot> set = konwertujMapDoSet(mapa);
        printSetKotow(set);
    }

    public static Map<String, Kot> utworzMap() {
        //tutaj wpisz swój kod
        HashMap<String, Kot> lista = new HashMap<String,Kot>();

        Kot kot1 = new Kot("Bonifacy");
        Kot kot2 = new Kot("Alojzy");
        Kot kot3 = new Kot("Srojzy");
        Kot kot4 = new Kot("Mikus");
        Kot kot5 = new Kot("Pikus");
        Kot kot6 = new Kot("Arus");
        Kot kot7 = new Kot("Barus");
        Kot kot8 = new Kot("Karus");
        Kot kot9 = new Kot("Mirus");
        Kot kot10 = new Kot("Jarus");
        lista.put(kot1.imie,kot1);
        lista.put(kot2.imie,kot2);
        lista.put(kot3.imie,kot3);
        lista.put(kot4.imie,kot4);
        lista.put(kot5.imie,kot5);
        lista.put(kot6.imie,kot6);
        lista.put(kot7.imie,kot7);
        lista.put(kot8.imie,kot8);
        lista.put(kot9.imie,kot9);
        lista.put(kot10.imie,kot10);

        return lista;
    }

    public static Set<Kot> konwertujMapDoSet(Map<String, Kot> mapa) {
        //tutaj wpisz swój kod

        HashMap<String,Kot> lista = new HashMap<>(mapa);
       Set koniec = new HashSet<String>();
        for(Map.Entry<String,Kot> para : lista.entrySet()){
            koniec.add(para.getValue());

        }

        return koniec;



    }

    public static void printSetKotow(Set<Kot> set) {
        for (Kot kot : set) {
            System.out.println(kot);
        }
    }

    public static class Kot {
        private String imie;

        public Kot(String imie) {
            this.imie = imie;
        }

        public String toString() {
            return "Kot " + this.imie;
        }
    }


}
