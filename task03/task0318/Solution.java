package pl.codegym.task.task03.task0318;

/* 
Plan podboju świata
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        String sWiek = bufferedReader.readLine();
        String imie = bufferedReader.readLine();
        
        int nWiek = Integer.parseInt(sWiek);

        System.out.println(imie+" "+"przejmie władzę nad światem za"+" "+nWiek+ " lat. Mua ha ha!");









    }
}
