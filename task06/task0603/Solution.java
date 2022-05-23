package pl.codegym.task.task06.task0603;

/* 
Obiekty klasy Kot i Pies: w każdej po 50000
*/

public class Solution {
    public static void main(String[] args) {
        int obiekty = 50000;
        
        Kot[] kot = new Kot[obiekty];
        Pies[] pies = new Pies[obiekty];
        
        
       for (int i=0; i<obiekty; i++){
            kot[i] = new Kot();
            pies[i] = new Pies();
           
       }
        
        
        
        
    }
}

class Kot {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Kot został zniszczony");
    }
}

class Pies {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Pies został zniszczony");
    }
}
