package pl.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Granie w Javarellę
*/

public class Solution {


    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> lista = new ArrayList<>();

        ArrayList<Integer> przez3 = new ArrayList<>();
        ArrayList<Integer> przez2 = new ArrayList<>();
        ArrayList<Integer> reszta = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            lista.add(0, Integer.parseInt(reader.readLine()));
        }

        for (int j = 0; j < 20; j++) {
            if (lista.get(j) % 2 == 0 || lista.get(j) % 3 == 0) {
                if (lista.get(j) % 2 == 0) {
                    przez2.add(0, lista.get(j));
                }

                if (lista.get(j) % 3 == 0) {
                    przez3.add(0, lista.get(j));
                }
            } else {
                reszta.add(0, lista.get(j));
            }
        }

        printLista(lista);
        printLista(przez3);
        printLista(przez2);
        printLista(reszta);

    }

    public static void printLista(List<Integer> lista) {
        for (int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
