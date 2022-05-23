package pl.codegym.task.task01.task0130;

/* 
Nasz pierwszy konwerter!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(konwertujCelsjuszaNaFahrenheita(41));
    }

    public static double konwertujCelsjuszaNaFahrenheita(int celsjusz) {
       double farenheit = celsjusz*9/5.0+32;

        return farenheit;
    }
}