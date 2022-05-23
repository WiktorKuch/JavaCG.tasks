package pl.codegym.task.task06.task0613;

/* 
Kot i statyczne
*/

public class Solution {
    public static void main(String[] args) {
        // Tworzy 10 kotów
        while(Kot.licznikKotow<10){
        Kot kot = new Kot();
        Kot.licznikKotow++;}
        
        
       
         System.out.println(Kot.licznikKotow);
        // Wyświetla wartość zmiennej licznikKotow
    }

    public static class Kot {
        // Tworzy zmienną statyczną licznikKotow
       public static int licznikKotow;
        // Deklaruje konstruktor
        
        public Kot(){
            licznikKotow++;
        }
    }
}
