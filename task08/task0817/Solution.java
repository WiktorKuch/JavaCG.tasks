package pl.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Powtórzenia nie są potrzebne
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {
        //tutaj wpisz swój kod
        HashMap<String,String> mapa = new HashMap<>();
        mapa.put("Kaczmarek","Wiktor");
        mapa.put("Kowalczyk","Maciek");
        mapa.put("Bartosik","Bartek");
        mapa.put("Kaczmarekr","Alojzy");
        mapa.put("Bartosikt","Bartek");
        mapa.put("Jedrzejewski","Patryk");
        mapa.put("Mikołajczyk","Wiktor");
        mapa.put("Kowalczyky","Maciek");
        mapa.put("Sralala","Mikołaj");
        mapa.put("Alalal","Wiktor");
        return mapa;

    }

    public static void usunPowtorzoneImiona(Map<String, String> mapa) {
        //tutaj wpisz swój kod
        HashMap<String,String> kopia = new HashMap<>(mapa);
        for (String copyName : mapa.values() ){
            int count = 0;
            for (String name : mapa.values()) {
                if (name.equals(copyName)) {
                    count++;
                }
            }
            if (count > 1) {
                usunElementZMapPoWartosci(mapa, copyName);
            }
        }
    }

    public static void usunElementZMapPoWartosci(Map<String, String> mapa, String wartosc) {
        HashMap<String, String> kopia = new HashMap<String, String>(mapa);
        for (Map.Entry<String, String> para : kopia.entrySet()) {
            if (para.getValue().equals(wartosc)) {
                mapa.remove(para.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
