package pl.codegym.task.task03.task0303;

/* 
Wymiana walut
*/

public class Solution {
    public static void main(String[] args) {
        
        
        System.out.println(konwertujEurNaUsd(3,4.46));
         System.out.println(konwertujEurNaUsd(6,4.46));
         
          
    }

    public static double konwertujEurNaUsd(int eur, double kursWymiany) {
    double usd = eur*kursWymiany;
    
    return usd;
    
 
    
    
    }
    
}
