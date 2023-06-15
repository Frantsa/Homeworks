package Homework4;

import java.util.Scanner;

public class Tack6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int firNum = input.nextInt();

        System.out.println("Enter second number");
        int secNum = input.nextInt();

        System.out.println("Enter symbol");
        String operation = input.next();

        int res = operation.equals("+")? firNum + secNum:
                operation.equals("-")? firNum - secNum:
                        operation.equals("*")? firNum*secNum:
                                operation.equals("/")? firNum / secNum :
                                        operation.equals("%")? firNum % secNum :0;
        System.out.println(res);


    }
}
