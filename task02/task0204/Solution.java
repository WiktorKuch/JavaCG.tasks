package pl.codegym.task.task02.task0204;

/* 
Relacje rodzinne
*/
public class Solution {
    public static void main(String[] args) {
        Mezczyzna mezczyzna = new Mezczyzna();
        Kobieta kobieta = new Kobieta();
        kobieta.partner = mezczyzna;
        mezczyzna.partnerka = kobieta;
    }

    public static class Mezczyzna {
        public int wiek;
        public int wzrost;
        public Kobieta partnerka;
    }

    public static class Kobieta {
        public int wiek;
        public int wzrost;
        public Mezczyzna partner;
    }
}
