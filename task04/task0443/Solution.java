package pl.codegym.task.task04.task0443;


/* 
Imię to imię
*/
import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
    
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();
        String d = scanner.nextLine();
        
        int p =Integer.parseInt(b);
        int k =Integer.parseInt(c);
        int j =Integer.parseInt(d);
        
        
        System.out.println("Mam"+" "+"na"+" "+"imię"+" "+a+".");
        System.out.println("Urodziłem/am się"+" "+k+"/"+j+"/"+p);
        
    }
}
