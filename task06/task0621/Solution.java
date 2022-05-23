package pl.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Relacje między kotami
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       
        String imieDziadka = reader.readLine();
        Kot dziadek = new Kot(imieDziadka, null, null);
        
        String imieBabci = reader.readLine();
        Kot babcia = new Kot(imieBabci, null, null);
        
        String imieOjca = reader.readLine();
        Kot ojciec = new Kot(imieOjca, null, dziadek);
        
        String imieMatki = reader.readLine();
        Kot matka = new Kot(imieMatki, babcia, null);

        String imieSyna = reader.readLine();
        Kot syn = new Kot(imieSyna, matka, ojciec);
        
        String imieCorki = reader.readLine();
        Kot corka = new Kot(imieCorki, matka, ojciec);

        System.out.println(dziadek);
        System.out.println(babcia);
        System.out.println(ojciec);
        System.out.println(matka);
        System.out.println(syn);
        System.out.println(corka);
        
        
    
    

        
    }

    public static class Kot {
        private String imie;
        private Kot rodzicMama;
        private Kot rodzicTata;
        
        Kot(String imie, Kot rodzicMama , Kot rodzicTata) {
            this.imie=imie;
            this.rodzicMama=rodzicMama;
            this.rodzicTata=rodzicTata;
        }

        @Override
        public String toString() {
            if (rodzicTata == null && rodzicMama == null)
                return "Imię kota to " + imie + ", brak matki, brak ojca ";
            else if(rodzicTata == null && rodzicMama !=null)
                return "Imię kota to " + imie + ", " + rodzicMama.imie + " to matka, brak ojca ";
            else if(rodzicTata != null && rodzicMama ==null)
                return "Imię kota to " + imie + ", brak matki, " + rodzicTata.imie + " to ojciec";
            else if(rodzicTata != null && rodzicMama != null)
                return "Imię kota to " + imie + ", " +  rodzicMama.imie + " to matka, " + rodzicTata.imie + " to ojciec";
            else
                return "";
        }
    }
}
