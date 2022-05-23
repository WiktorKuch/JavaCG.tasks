package pl.codegym.task.task05.task0513;

/* 
Stwórzmy sobie prostokąt
*/

public class Prostokat {
    int szerokosc;
    int wysokosc;
    int lewy;
    int gora;
    
    public void inicjalizuj(int szerokosc){
        this.szerokosc=szerokosc;
    }
    
    public void inicjalizuj(int szerokosc,int wysokosc){
        this.szerokosc=szerokosc;
        this.wysokosc=wysokosc;
    }
    
    public void inicjalizuj(int szerokosc,int wysokosc,int lewy){
        this.szerokosc=szerokosc;
        this.wysokosc=wysokosc;
        this.lewy=lewy;
    }
    
    public void inicjalizuj(int szerokosc,int wysokosc,int lewy, int gora){
        this.szerokosc=szerokosc;
        this.wysokosc=wysokosc;
        this.lewy=lewy;
        this.gora=gora;
    }
    

    public static void main(String[] args) {

    }
}
