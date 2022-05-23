package pl.codegym.task.task05.task0505;

/* 
Kocia jatka
*/

public class Solution {
    public static void main(String[] args) {
     Kot kot1 = new Kot("kot1",3,4,5);
     Kot kot2 = new Kot("kot2",3,4,5);
     Kot kot3 = new Kot("kot3",3,4,5);
     
     
      System.out.println(kot1.walka(kot2));
      System.out.println(kot2.walka(kot3));
      System.out.println(kot1.walka(kot3));
     
     
    
     
     
     
     
    }

    public static class Kot {
        protected String imie;
        protected int wiek;
        protected int waga;
        protected int sila;

        public Kot(String imie, int wiek, int waga, int sila) {
            this.imie = imie;
            this.wiek = wiek;
            this.waga = waga;
            this.sila = sila;
        }

        public boolean walka(Kot innyKot) {
            int wiekPrzewaga = this.wiek > innyKot.wiek ? 1 : 0;
            int wagaPrzewaga = this.waga > innyKot.waga ? 1 : 0;
            int silaPrzewaga = this.sila > innyKot.sila ? 1 : 0;

            int wynik = wiekPrzewaga + wagaPrzewaga + silaPrzewaga;
            return wynik > 2; // return wynik > 2 ? true : false;
        }
    }
}