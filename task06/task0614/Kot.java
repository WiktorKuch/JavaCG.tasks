package pl.codegym.task.task06.task0614;

import java.util.ArrayList;

/* 
Statyczne koty
*/

public class Kot {
    //tutaj wpisz swój kod
    public static ArrayList<Kot> koty = new ArrayList<Kot>();

    public Kot() {
    }


    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Kot[] kot = new Kot[10] ;
        
        int x=0;
        
       while (x<10){
           kot[x]=new Kot();
           koty.add(kot[x]);
           x++;
           
       }
       
        printKoty();
    }

    public static void printKoty() {
        //tutaj wpisz swój kod
        for (Kot k : koty){
        System.out.println(k);}
        
    }
}
