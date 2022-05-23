package pl.codegym.task.task08.task0824;

/* 
Załóż rodzinę
*/

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod


        Ludzie dziadek1 = new Ludzie("Janusz",false,76);
        Ludzie dziadek2 = new Ludzie("Andrzej",false,67);
        Ludzie babcia1 = new Ludzie("Alina",false,67);
        Ludzie babcia2 = new Ludzie("Basia",false,67);
        Ludzie ojciec = new Ludzie("Mikolaj",false,44);
        Ludzie matka = new Ludzie("Angelika",true,34);
        Ludzie dziecko1 = new Ludzie("Mati",false,12);
        Ludzie dziecko2 = new Ludzie("Angela",false,24);
        Ludzie dziecko3 = new Ludzie("Majla",false,13);

       dziadek1.dzieci.add(ojciec);
       babcia1.dzieci.add(ojciec);
       dziadek2.dzieci.add(matka);
       babcia2.dzieci.add(matka);
       ojciec.dzieci.addAll(Arrays.asList(dziecko1,dziecko2,dziecko3));
       matka.dzieci.addAll(Arrays.asList(dziecko1,dziecko2,dziecko3));
       List<Ludzie> ludziska = Arrays.asList(dziadek1,dziadek2,babcia1,babcia2,ojciec,matka,dziecko1,dziecko2,dziecko3);
       for(Ludzie s : ludziska){
           System.out.println(s);
       }




    }

    public static class Ludzie {
        //tutaj wpisz swój kod
        String imie;
        boolean plec;
        int wiek;
        ArrayList<Ludzie> dzieci = new ArrayList<>();

        public Ludzie(String imie,boolean plec,int wiek){
            this.imie=imie;
            this.plec=plec;
            this.wiek=wiek;


        }
        public Ludzie(String imie,boolean plec,int wiek,ArrayList<Ludzie> dzieci){
            this.imie=imie;
            this.plec=plec;
            this.wiek=wiek;


        }

        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            int licznikDzieci = this.dzieci.size();
            if (licznikDzieci > 0) {
                tekst += ", dzieci: " + this.dzieci.get(0).imie;

                for (int i = 1; i <licznikDzieci; i++) {
                    Ludzie dziecko = this.dzieci.get(i);
                    tekst += ", " + dziecko.imie;
                }
            }
            return tekst;
        }
    }

}
