package pl.codegym.task.task07.task0707;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        
        
        ArrayList<String> lista = new ArrayList<String>(5);
        
       lista.add("String1");
       lista.add("String2");
       lista.add("String3");
       lista.add("String4");
       lista.add("String5");
      
        System.out.println(lista.size());
       
        for ( int i = 0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
        
        
        
    }
}
