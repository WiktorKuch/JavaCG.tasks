package pl.codegym.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tablica = new String[20];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = reader.readLine();
        }

        sortuj(tablica);

        for (String x : tablica) {
            System.out.println(x);
        }
    }

    public static void sortuj(String[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = i; j < tablica.length; j++) {
                if (isWiekszeOd(tablica[i], tablica[j])) {
                    String temp = tablica[i];
                    tablica[i] = tablica[j];
                    tablica[j] = temp;
                }
            }
        }
    }

    public static boolean isWiekszeOd(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
