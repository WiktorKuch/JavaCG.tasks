package pl.codegym.task.task01.task0129;

/* 
Oblicz obwód koła
*/

public class Solution {
    public static void main(String[] args) {
        printObwodKola(5);
    }

    public static void printObwodKola(int promien) {
        double C = 2*3.14*promien;
        System.out.println(C);
    }
}