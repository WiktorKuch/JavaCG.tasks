package pl.codegym.task.task09.task0919;

/* 
Dzielenie przez zero
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {


    public static void main(String[] args) {
        try {
            dzielimyPrzezZero();

        }catch(ArithmeticException e){
            e.printStackTrace();
        }
    }

    public static void dzielimyPrzezZero() throws ArithmeticException {

            System.out.println(5/0);

    }


}
