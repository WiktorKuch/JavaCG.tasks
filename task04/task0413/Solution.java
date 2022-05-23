package pl.codegym.task.task04.task0413;

/* 
Dzień tygodnia
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sliczba = bufferedReader.readLine();
        int liczba = Integer.parseInt(sliczba);
         
         if(liczba==1) System.out.println("Poniedziałek");
         if(liczba==2) System.out.println("Wtorek");
         if(liczba==3) System.out.println("Środa");
         if(liczba==4) System.out.println("Czwartek");
         if(liczba==5) System.out.println("Piątek");
         if(liczba==6) System.out.println("Sobota");
         if(liczba==7) System.out.println("Niedziela");
         if(liczba > 7 || liczba <1 ) System.out.println("Nie ma takiego dnia tygodnia");
    }
}