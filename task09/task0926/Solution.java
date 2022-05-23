package pl.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
Lista tablic z liczbami
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> lista = utworzLista();
        printLista(lista);
    }

    public static ArrayList<int[]> utworzLista() {
        ArrayList<int[]> wszystko = new ArrayList<>();
        int[] tab1 = {1,2,3,5,5};
        int[] tab2 = {1,2};
        int[] tab3 = {1,2,3,5};
        int[] tab4 = {1,2,3,5,5,3,4};
        int[] tab5 = {};

        wszystko.add(tab1);
        wszystko.add(tab2);
        wszystko.add(tab3);
        wszystko.add(tab4);
        wszystko.add(tab5);

        return wszystko;


     }

    public static void printLista(ArrayList<int[]> lista) {
        for (int[] tablica : lista) {
            for (int x : tablica) {
                System.out.println(x);
            }
        }
    }
}
