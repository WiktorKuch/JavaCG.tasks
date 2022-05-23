package pl.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/* 
Bank-świnka na bazie konsoli
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        
       
       int suma=0;
       
      
       
       while(true){
            String word = scanner.next();
            if(word.equals("sumuj")){
                break;
            }else{
                
                int number = Integer.parseInt(word);
                suma=suma+number;
            }
           
           
           
       }
       
       
       System.out.println(suma);
       
    }
}
