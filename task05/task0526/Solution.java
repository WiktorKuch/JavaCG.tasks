package pl.codegym.task.task05.task0526;

/* 
Mężczyzna i kobieta
*/

public class Solution {
    public static void main(String[] args) {
        Mezczyzna mezczyzna1 = new Mezczyzna("Wiktor",23,"SAnol");
        Mezczyzna mezczyzna2 = new Mezczyzna("maciek",21,"HHJJJ");
        
        Kobieta kobieta1 = new Kobieta("ndeje",23,"hsdh");
        Kobieta kobieta2 = new Kobieta("sdad",43,"gsjs");
        
       System.out.println(mezczyzna1.imie+" "+mezczyzna1.wiek+" "+mezczyzna1.adres);
       System.out.println(mezczyzna2.imie+" "+mezczyzna2.wiek+" "+mezczyzna2.adres);
       
       System.out.println(kobieta1.imie+" "+kobieta1.wiek+" "+kobieta1.adres);
       System.out.println(kobieta2.imie+" "+kobieta2.wiek+" "+kobieta2.adres);
    }

    //tutaj wpisz swój kod
    
    
    
    public static class Mezczyzna{
        String imie;
        int wiek;
        String adres;
        
        public Mezczyzna(String imie, int wiek , String adres){
            this.imie=imie;
            this.wiek=wiek;
            this.adres=adres;
        }
    }
    
    
    public static class Kobieta{
        String imie;
        int wiek;
        String adres;
        
        public Kobieta(String imie , int wiek , String adres){
            this.imie=imie;
            this.wiek=wiek;
            this.adres=adres;
        }
    }
    
    
    
    
    
    
    
}
