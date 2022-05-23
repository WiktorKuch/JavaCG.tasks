package pl.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* 
Koci Set
*/

public class Solution {
    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();

        //tutaj wpisz swój kod. krok 3
        Iterator<Kot> ite = koty.iterator();
        while (ite.hasNext()){
            koty.remove(ite.next());
            break;
        }

        printKoty(koty);
    }

    public static Set<Kot> utworzKoty() {
        //tutaj wpisz swój kod. krok 2
        Set<Kot> koty = new HashSet<Kot>();
        Kot kot1 = new Kot();
        Kot kot2 = new Kot();
        Kot kot3 = new Kot();

        koty.add(kot1);
        koty.add(kot2);
        koty.add(kot3);

        return koty;
    }

    public static void printKoty(Set<Kot> koty) {
        // krok 4
        for(Kot a : koty){
            System.out.println(a);
        }


    }
      public static class Kot{

    }
    // krok 1
}
