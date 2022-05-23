package pl.codegym.task.task03.task0325;

import java.io.*;

/* 
Oczekiwania finansowe
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        String n = bufferedReader.readLine();
        int sn = Integer.parseInt(n);
        
        System.out.println("Zarobię"+" "+n+" "+"zł na godzinę");
        
        
    }
}
