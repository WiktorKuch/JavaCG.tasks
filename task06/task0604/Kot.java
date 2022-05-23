package pl.codegym.task.task06.task0604;

/* 
Licznik kotów
*/

public class Kot {
    public static int licznikKotow = 0;

    //tutaj wpisz swój kod
        public void finalize(){
        licznikKotow--;
    
               }
    
    public Kot(){
        licznikKotow=licznikKotow+1;
    }



    public static void main(String[] args) {
         
    }
}