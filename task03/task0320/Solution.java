package pl.codegym.task.task03.task0320;


/* 
Skromny programista
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        String imie = bufferedReader.readLine();
       
        System.out.println(imie+" "+"zarabia 120 000 zł na rok. Ha ha ha!");
    }
}
