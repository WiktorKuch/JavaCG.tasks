package pl.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Ulice i domy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int[] tab= new int[15];
         
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         
         int parzyste=0;
         int nieparzyste=0;
         int temp=0;
         
         

         
         for( int i=0; i<tab.length; i++){
             
             tab[i]=Integer.parseInt(reader.readLine());
             if(i%2==0){
                temp=tab[i];
                parzyste=temp+parzyste;
                 
             }
             
            else{
                temp=tab[i];
                nieparzyste=temp+nieparzyste;
                
            }
             
             
             
             
         }
        
        if(parzyste>nieparzyste){
                 System.out.println("Więcej ludzi mieszka w domach o parzystych numerach.");
             }
             else{
                 System.out.println("Więcej ludzi mieszka w domach o nieparzystych numerach.");
             }
        
    }
}
