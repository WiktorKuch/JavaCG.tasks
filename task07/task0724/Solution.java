package pl.codegym.task.task07.task0724;

/* 
Spis członków rodziny
*/

public class Solution {
    public static void main(String[] args) {
        // tutaj wpisz swój kod

        Ludzie matka = new Ludzie("Anna",true,35, dziadek1, babcia1);
        Ludzie ojciec = new Ludzie("Marcin",false,45, dziadek2, babcia2);
        Ludzie dziadek1 = new Ludzie("Andrzej",false,78);
        Ludzie dziadek2 = new Ludzie("Mikołaj",true,70);
        Ludzie babcia1 = new Ludzie("Alina",false,67);
        Ludzie babcia2 = new Ludzie("Hania",true,65);
        Ludzie dziecko1 = new Ludzie("Kasia",false,9, ojciec, matka);
        Ludzie dziecko2 = new Ludzie("Maciek",false,12, ojciec, matka);
        Ludzie dziecko3 = new Ludzie("Bartek",true,15, ojciec, matka);

        System.out.println(matka);
        System.out.println(ojciec);
        System.out.println(dziadek1);
        System.out.println(dziadek2);
        System.out.println(babcia1);
        System.out.println(babcia2);
        System.out.println(dziecko1);
        System.out.println(dziecko2);
        System.out.println(dziecko3);

    }

    public static class Ludzie {
        // tutaj wpisz swój kod
        String imie;
        boolean plec;
        int wiek;
        Ludzie ojciec;
        Ludzie matka;


        public Ludzie (String imie, boolean plec, int wiek){
            this.imie=imie;
            this.plec=plec;
            this.wiek=wiek;
        }

        public Ludzie (String imie, boolean plec, int wiek, Ludzie ojciec, Ludzie matka){
            this.imie=imie;
            this.plec=plec;
            this.wiek=wiek;
            this.ojciec=ojciec;
            this.matka=matka;

        }

        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            if (this.ojciec != null) {
                tekst += ", ojciec: " + this.ojciec.imie;
            }

            if (this.matka != null) {
                tekst += ", matka: " + this.matka.imie;
            }

            return tekst;
        }

    }

}