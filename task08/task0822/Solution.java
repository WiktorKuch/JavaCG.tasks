package pl.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Najmniejsza z N liczb
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> listaLiczbCalkowitych = getListaLiczbCalkowitych();
        System.out.println(getMinimum(listaLiczbCalkowitych));
     }

    public static int getMinimum(List<Integer> array) {
        int min = array.get(0);
        for (int i = 1; i <array.size(); i++) {
            if(array.get(i)<min){
                min=array.get(i);
            }

        }

        return min;
    }

    public static List<Integer> getListaLiczbCalkowitych() throws IOException {
        // Tworzy i inicjalizuje listę
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int liczby = Integer.parseInt(reader.readLine());

        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = 0; i <liczby; i++) {
            int licz = Integer.parseInt(reader.readLine());
            lista.add(licz);
        }

        return lista;
    }
}
