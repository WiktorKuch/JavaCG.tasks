package pl.codegym.task.task05.task0507;

/* 
Średnia arytmetyczna
*/
 import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws Exception {
        
    
    Scanner scanner = new Scanner(System.in);

       int liczba=scanner.nextInt();

        double suma = 0;
        double count =0;
        while (true){
        if (liczba==-1)
        break;
        else 
        suma+=liczba;
        count++;
        
        }
        double ave=suma/count;
        System.out.println(ave);
        
        
        
    }
    
    
    
    
    
    
}

