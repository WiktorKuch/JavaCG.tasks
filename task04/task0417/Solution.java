package pl.codegym.task.task04.task0417;

/* 
Masz parę?
*/
import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        
        if(b==c && a==c && a==b){
            System.out.println(a + " " + b + " " + c);
        }
        else if(a!=b && b!=c && c!=a){
        }
        if(a==b && b!=c){
            System.out.println(a + " " + b);
        }
        else if (a==c && b!=c){
            System.out.println(a + " " + c);
        }
        else if (b==c && b!=a){
            System.out.println(b + " " + c);
        }
        
    }
}