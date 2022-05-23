package pl.codegym.task.task04.task0427;

/* 
Opisywanie liczb
*/
import java.lang.String;
import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String b = bufferedReader.readLine();
        int a = Integer.parseInt(b);
        int length = String.valueOf(a).length();
        
        
        if ( a>0 && a<1000){
            if (a%2==0 ){
                if(length==1)
                System.out.println("parzysta liczba jednocyfrowa");
                
                if(length==2)
                System.out.println("parzysta liczba dwucyfrowa");
                
                if(length==3)
                System.out.println("parzysta liczba trzycyfrowa");
            }
            if(a%2!=0){
                if(length==1)
                System.out.println("nieparzysta liczba jednocyfrowa");
                
                if(length==2)
                System.out.println("nieparzysta liczba dwucyfrowa");
                
                if(length==3)
                System.out.println("nieparzysta liczba trzycyfrowa");
            }
            
        }
        
        
        
        
        
        
        

    }
}
