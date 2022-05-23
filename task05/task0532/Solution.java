package pl.codegym.task.task05.task0532;

import java.io.*;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maksimum = Integer.MIN_VALUE;
        int N = Integer.parseInt(reader.readLine());
        int nCount = N;
        if (!(N <= 0)) {
            while (nCount > 0) {
                N = Integer.parseInt(reader.readLine());
                nCount--;
                if (N > maksimum) {
                maksimum = N;
                }
            }
        System.out.println(maksimum);
        }
    }
}
