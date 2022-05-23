package pl.codegym.task.task04.task0424;

/* 
Trzy liczby
*/
import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String pierwsza = reader.readLine();
        String druga = reader.readLine();
        String trzecia = reader.readLine();
        
        int a = Integer.parseInt(pierwsza);
        int b = Integer.parseInt(druga);
        int c = Integer.parseInt(trzecia);
        
        if (a==b && a!=c)
            {
                System.out.println("3");
            }
        if (a==c && a!=b)
            {
                System.out.println("2");
            }
        if (c==b && b!=a)
            {
                System.out.println("1");
            }
    }
}
