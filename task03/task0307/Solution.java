package pl.codegym.task.task03.task0307;

/* 
Witaj, StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        zerg1.imie = "ala";
        Zerg zerg2 = new Zerg();
        zerg2.imie = "papa";
        Zerg zerg3 = new Zerg();
        zerg3.imie = "nsfwe";
        Zerg zerg4 = new Zerg();
        zerg4.imie = "wrgsafwe";
        Zerg zerg5 = new Zerg();
        zerg5.imie = "hdjs";
        
        Protoss protoss1 = new Protoss();
        protoss1.imie = "basia";
        
        Protoss protoss2 = new Protoss();
        protoss2.imie = "kasia";
        
        Protoss protoss3 = new Protoss();
        protoss3.imie = " mix";
        
        Terranin terranin1 = new Terranin();
        terranin1.imie = "kacper";
        
        Terranin terranin2 = new Terranin();
        terranin2.imie = "bikuś";
        
        Terranin terranin3 = new Terranin();
        terranin3.imie = "tatatata";
        
        Terranin terranin4 = new Terranin();
        terranin4.imie = "tatajkhiptata";
        
        
    }

    public static class Zerg {
        public String imie;
    }

    public static class Protoss {
        public String imie;
    }

    public static class Terranin {
        public String imie;
    }
}
