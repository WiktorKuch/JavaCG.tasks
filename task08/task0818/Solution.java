package pl.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.jar.JarEntry;

/* 
Tylko dla bogaczy
*/

public class Solution {
    public static HashMap<String, Integer> utworzMap() {
        //tutaj wpisz swój kod

        HashMap<String,Integer> para = new HashMap<String,Integer>();
        para.put("Kaczmarek",1200);
        para.put("Misiu",699);
        para.put("ds",300);
        para.put("vr",300);
        para.put("ege",300);
        para.put("sfv",300);
        para.put("fsf",300);
        para.put("fss",300);
        para.put("sfw",300);
        para.put("scw",300);
        return para;
    }

    public static void usunPozycjeZmap(HashMap<String, Integer> map) {
        //tutaj wpisz swój kod
        HashMap<String,Integer> kopia = new HashMap<>(map);

        for(Map.Entry<String,Integer> kotek :kopia.entrySet()){
            if(kotek.getValue() < 500){
                map.remove(kotek.getKey());
            }
        }



    }

    public static void main(String[] args) {

    }
}