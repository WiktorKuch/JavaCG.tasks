package pl.codegym.task.task03.task0312;

/* 
Konwersja czasu
*/

public class Solution {
    public static int konwertujNaSekundy(int godzina){
        int k = godzina*60*60;
        return k;
        
    }

    public static void main(String[] args) {
        
        System.out.println(konwertujNaSekundy(3));
        System.out.println(konwertujNaSekundy(78));
        
        
    }
}
