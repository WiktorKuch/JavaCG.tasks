package pl.codegym.task.task06.task0612;

/* 
Kalkulator
*/

public class Kalkulator {
    public static int plus(int a, int b) {
        int suma = a+b;
        return suma;
    }

    public static int minus(int a, int b) {
        int roznica = a-b;
        return roznica;
    }

    public static int multiply(int a, int b) {
        int mnozenie = a*b;
        return mnozenie;
    }

    public static double divide(int a, int b) {
        double dzielenie = (double)a/ (double) b;
        return dzielenie;
    }

    public static double percent(int a, int b) {
        double c=a;
        double k=b;
        return  0.01*k*c;
    }

    public static void main(String[] args) {

    }
}