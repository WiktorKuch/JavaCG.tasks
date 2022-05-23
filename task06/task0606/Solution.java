package pl.codegym.task.task06.task0606;

import java.io.*;

/* 
Cyfry parzyste i nieparzyste
*/

public class Solution {

  public static int parzyste;
    public static int nieparzyste;

    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int b = Integer.parseInt(reader.readLine());
        
        while(b > 0){
           if(b % 2 == 0){
              parzyste++;
           }
           else if( b % 2 == 1){
               nieparzyste++;
           }
          b = b / 10;
        }
        System.out.println("Parzyste: " + parzyste + " Nieparzyste: " + nieparzyste); 

    }
}
