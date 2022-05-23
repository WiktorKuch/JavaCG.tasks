package pl.codegym.task.task02.task0216;

/* 
Najmniejsza z trzech liczb
*/
public class Solution {
    public static int min(int a, int b, int c) {
       int m1;
       int m2;
       int m3;
       
       if(a<b && a<c){
          m1=a;
          return a;
       }
       
        else if(b<a && b<c){
            m2=b;
         return b;
         
        }
         else if(c<a || c<b){
             m3=c;
        return c;
        }
        else return a;
        
    }
        
       
       
    
    

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}