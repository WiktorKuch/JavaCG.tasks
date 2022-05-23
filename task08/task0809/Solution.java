package pl.codegym.task.task08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Czas na 10000 wstawień
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCzasWstawienWms(new ArrayList()));
        System.out.println(getCzasWstawienWms(new LinkedList()));
    }

    public static long getCzasWstawienWms(List lista) {
        // tutaj wpisz swój kod

        Date czasPoczatkowy = new Date();

        wstaw10000(lista);

        // tutaj wpisz swój kod
        Date czasKoncowy = new Date();


        long roznicaCzasow = czasKoncowy.getTime() - czasPoczatkowy.getTime();
        return roznicaCzasow;


    }

    public static void wstaw10000(List lista) {
        for (int i = 0; i < 10000; i++) {
            lista.add(0, new Object());
        }
    }
}
