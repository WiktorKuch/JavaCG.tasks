package pl.codegym.task.task04.task0412;

/* 
Liczby dodatnie i ujemne
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputstream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputstream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        String sliczba = bufferedReader.readLine();
        int liczba =Integer.parseInt(sliczba);
        
        if(liczba<0)
        {
            liczba = liczba+1;
            System.out.println(liczba);
        }
        
        else if(liczba>0)
        {liczba=liczba*2;
            System.out.println(liczba);
            
        }
        else 
        System.out.println(liczba);
            

    }

}