package pl.codegym.task.task03.task0319;

/* 
Prognozy
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        String imie = bufferedReader.readLine();
        String liczba1 = bufferedReader.readLine();
        String liczba2 = bufferedReader.readLine();
        
        int sLiczba1 = Integer.parseInt(liczba1);
        int nLiczba2 = Integer.parseInt(liczba2);
        
        System.out.println(imie+" "+"dostanie"+" "+liczba1+" "+"za"+" "+liczba2+" "+"lat.");
        
        
        
        
    }
}
