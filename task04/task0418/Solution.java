package pl.codegym.task.task04.task0418;

/* 
Mniejsza z dwóch liczb
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if ( a<b ) 
        System.out.println(a);
        else 
        System.out.println(b);
    }
}