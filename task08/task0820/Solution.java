package pl.codegym.task.task08.task0820;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* 
Zwierzęcy secik
*/

public class Solution {
    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();
        Set<Pies> psy = utworzPsy();

        Set<Object> zwierzeta = dolacz(koty, psy);
        printZwierzeta(zwierzeta);

        usunKoty(zwierzeta, koty);
        printZwierzeta(zwierzeta);
    }

    public static Set<Kot> utworzKoty() {
        HashSet<Kot> koty = new HashSet<Kot>();
        Kot kot1 = new Kot();
        Kot kot2 = new Kot();
        Kot kot3 = new Kot();
        Kot kot4 = new Kot();

        koty.add(kot1);
        koty.add(kot2);
        koty.add(kot3);
        koty.add(kot4);

        //tutaj wpisz swój kod

        return koty;
    }

    public static Set<Pies> utworzPsy() {
        //tutaj wpisz swój kod
        Set<Pies> psy = new HashSet<Pies>();
        Pies pies1 = new Pies();
        Pies pies2 = new Pies();
        Pies pies3 = new Pies();

        psy.add(pies1);
        psy.add(pies2);
        psy.add(pies3);
        return psy;
    }

    public static Set<Object> dolacz(Set<Kot> koty, Set<Pies> psy) {
        //tutaj wpisz swój kod
        Set<Object> zwierzeta = new HashSet<>();
        zwierzeta.addAll(koty);
        zwierzeta.addAll(psy);

        return zwierzeta;
    }

    public static void usunKoty(Set<Object> zwierzeta, Set<Kot> koty) {
        //tutaj wpisz swój kod
        zwierzeta.removeAll(koty);
    }

    public static void printZwierzeta(Set<Object> zwierzeta) {
        //tutaj wpisz swój kod
        for(Object s : zwierzeta){
            System.out.println(s);
        }


    }
    public static class Kot{


    }

    public static class Pies{

    }

    //tutaj wpisz swój kod
}
