package pl.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Metoda w try-catch
*/

public class Solution {
    public static void main(String[] args) {
        czytajDane();
    }

    public static void czytajDane() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> lista = new ArrayList<>();

        while(true){
            try {

                lista.add(Integer.parseInt(reader.readLine()));

            }catch (IOException | NumberFormatException e){
                break;
            }

        }
        for(Integer s : lista){
            System.out.println(s);
        }



    }
}
