package pl.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Słowa na odwrót
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = bis.readLine();
            lista.add(s);
        }

        lista.remove(2);
        Collections.reverse(lista);

        for (String s : lista) {
            System.out.println(s);
        }
    }
}

