package pl.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Najdłuższy ciąg
*/

public class Solution {
     private static ArrayList<String> strings= new ArrayList<String>();

    public static void main(String[] args) throws Exception {
       strings = new ArrayList<>();
        ArrayList<String> max = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        String s = "";
        for (int i = 0; i < 5; i++){
            String string = scan.nextLine();
            strings.add(string);
            if(strings.get(i).length() > s.length()){
                s = strings.get(i);
            }
        }
        for (int i = 0; i < strings.size();i++){
            if (s.length() == strings.get(i).length()){

                max.add(strings.get(i));
            }
        }
        for(int i = 0; i < max.size();i++){
            System.out.println (max.get(i));
        }
    }   
}