package pl.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Samogłoski i spółgłoski
*/

public class Solution {
    public static char[] samogloski = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        // tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String slowo = reader.readLine();

        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        for(char c : slowo.toCharArray()){

            if(isSamogloska(c)){
                sb1.append(c).append(" ");
            }else if(c != ' '){
                sb2.append(c).append(" ");
            }
        }
        System.out.println(sb1);
        System.out.println(sb2);

    }

    // Ta metoda sprawdza, czy litera jest samogłoską
    public static boolean isSamogloska(char c) {
        c = Character.toLowerCase(c);  // Konwertuje na małe litery

        for (char d : samogloski)   // Szuka samogłosek w tablicy
        {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}