package pl.codegym.task.task06.task0608;

/* 
Metody statyczne dla kotów
*/

public class Kot {
    private static int licznikKotow = 0;

    public Kot() {
        licznikKotow++;
    }

    public static int getLicznikKotow(){
        //tutaj wpisz swój kod
        return licznikKotow;
    }

    public static void setLicznikKotow(int nowylicznikKotow) {
        //tutaj wpisz swój kod
        
    licznikKotow=nowylicznikKotow;
    }

    public static void main(String[] args) {

    }
    
}
