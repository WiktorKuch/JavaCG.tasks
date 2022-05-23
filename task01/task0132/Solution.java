package pl.codegym.task.task01.task0132;

/* 
Suma cyfr trzycyfrowej liczby
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumaCyfrLiczby(546));
    }

    public static int sumaCyfrLiczby(int liczba) {
       int suma =0;
       do{
        int cyfra = liczba%10;
        suma = suma+cyfra;
        liczba = (liczba - cyfra) / 10;
       }
        while ( liczba != 0 );
        return suma;
           
       
        
        
        
       }
}