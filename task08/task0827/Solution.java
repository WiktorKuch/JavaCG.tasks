package pl.codegym.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 
Praca z datami
*/

public class Solution {
    public static void main(String[] args) {


        System.out.println(isDataNieparzysta("MAY 1 2013"));
    }

    public static boolean isDataNieparzysta(String date) {



       Date d = new Date(date);
       Date d2 = new Date(d.getYear(),0,0);
       long  dzien = 24*60*60*1000;

       long roznica = (d.getTime()-d2.getTime())/dzien;

       if(!(roznica % 2 == 0)){
           return true;
       }else {
           return false;
       }



    }
}