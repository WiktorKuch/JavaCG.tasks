package pl.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/* 
Klasa ConsoleReader
*/

public class ConsoleReader {
    
   static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
    
    public static String readString() throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String s = reader.readLine();
         return s;
    }

    public static int readInt() throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        return a;
        

    }

    public static double readDouble() throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double b = Double.parseDouble(s);
        return b;
        
    }

    public static boolean readBoolean() throws Exception {
        //tutaj wpisz swój 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
       boolean c = Boolean.parseBoolean(s);
       return c;

    }

    public static void main(String[] args) {

    }
}
