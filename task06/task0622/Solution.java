package pl.codegym.task.task06.task0622;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int pom = 0;

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        
        for (int i = 0; i < 5; i ++)
        {
        
            if (a < b)
            {
                pom = a;
                a = b;
                b = pom;
            }
            
            if (b < c)
            {
                pom = b;
                b = c;
                c = pom;
            }
            
            if (c < d)
            {
                pom = c;
                c = d;
                d = pom;
            }
            
            if (d < e)
            {
                pom = d;
                d = e;
                e = pom;
            }
        }
        
        System.out.println(e);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }
}