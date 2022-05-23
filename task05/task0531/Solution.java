package pl.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Poprawianie funkcjonalności
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b , c, d ,e );

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b,int c, int d, int e) {
         int num1;
        int num2;
        int num3;
        int num4;

        num1 = a <= b ?                                       a:b;

        num2 = c <= d ?                                       c:d;

        num3 = num1 <= num2 ?                         num1:num2;

        num4 = num3 <= e ?                                num3:e;

        return num4;
    }
}
