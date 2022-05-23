package pl.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Mów zwięźle
*/

public class Solution {
    
    
    public static void main(String[] args) throws Exception {
         ArrayList<String> lista = new ArrayList<String>();
         ArrayList<String> max = new ArrayList<String>();
         BufferedReader pop = new BufferedReader(new InputStreamReader(System.in));
         
         for (int i=0; i<5; i++){
             String r = pop.readLine();
             lista.add(r);
         }
         
         String x =lista.get(0);
         for ( int i=0; i<lista.size(); i++){
             if(lista.get(i).length()<x.length()){
                 x =lista.get(i);
             }
             
         }
         for ( int i =0; i<lista.size(); i++){
             if(x.length()==lista.get(i).length()){
                 max.add(lista.get(i));
             }
         }
         for ( int i=0; i<max.size(); i++){
             System.out.println(max.get(i));
         }
        
    }
}
