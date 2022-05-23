package pl.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Locale;
import java.util.HashMap;
import java.util.Date;

/* 
Miła Emma i letnie wakacje
*/

public class Solution {
    public static HashMap<String, Date> utworzMap() throws ParseException {

        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.forLanguageTag("pl"));
        HashMap<String, Date> mapa = new HashMap<String, Date>();

        mapa.put("Stallone", df.parse("CZERWIEC 1 1980"));
        mapa.put("Miki", df.parse("LIPIEC 13 1983"));
        mapa.put("Mateusz", df.parse("SIERPIEŃ 15 1992"));
        mapa.put("Andrzej", df.parse("PAŹDZIERNIK 16 1993"));
        mapa.put("Krystian", df.parse("STYCZEŃ 19 1982"));
        mapa.put("Albert", df.parse("MARZEC 2 1995"));
        mapa.put("Damian", df.parse("SIERPIEŃ 5 1993"));
        mapa.put("Wiktor", df.parse("LISTOPAD 7 1999"));
        mapa.put("Patryk", df.parse("GRUDZIEŃ 8 1991"));
        mapa.put("Mikolaj", df.parse("LIPIEC 11 1984"));

        return mapa;

        //tutaj wpisz swój kod
    }

    public static void usunUrodzonychLatem(HashMap<String, Date> mapa) {
        //tutaj wpisz swój kod

        Iterator<Map.Entry<String,Date>> iterator = mapa.entrySet().iterator();

       while (iterator.hasNext()){
           Map.Entry<String,Date> para = iterator.next();
           if(para.getValue().getMonth() > 4 && para.getValue().getMonth() < 8){
               iterator.remove();
           }
       }

    }

    public static void main(String[] args) {

    }
}
