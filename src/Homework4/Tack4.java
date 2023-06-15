package Homework4;

import java.io.PrintStream;
import java.util.Scanner;

public class Tack4 {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Enter first number:");
        int x = inputNum.nextInt();
        System.out.println("Enter second number:");
        int y = inputNum.nextInt();
        boolean res = x > y;

        System.out.printf("Number %1$d is greater than %2$d and it is %3$B\n", x, y, res);
    }
}
