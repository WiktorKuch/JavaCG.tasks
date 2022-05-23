package pl.codegym.task.task05.task0510;

/* 
Inicjalizowanie kotów
*/

public class Kot {
    String imie = null;
    int wiek = 2;
    String adres =null;
    int waga=4;
    String kolor = "czerwony";
    
    public void inicjalizuj(String imie){
        this.imie=imie;
    }
    
    public void inicjalizuj(String imie , int waga,int wiek){
        this.imie=imie;
        this.waga=waga;
        this.wiek=wiek;
    }
    
    public void inicjalizuj(String imie , int wiek){
        this.imie=imie;
        this.wiek=wiek;
    }
    
    public void inicjalizuj(int waga,String kolor){
        this.waga=waga;
        this.kolor=kolor;
    }
    
    public void inicjalizuj(int waga,String kolor, String adres){
        this.waga=waga;
        this.kolor=kolor;
        this.adres=adres;
    }
    
    
    
    

    public static void main(String[] args) {

    }
}
