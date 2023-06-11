package Homework4;

import java.util.Scanner;

public class tack1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");

        String string1 = input.next();
        String string2 = input.next();
        String string3 = input.next();
        String string4 = input.next().concat(" ") + input.next().concat(" ") + input.next();

        System.out.println("string1 = " + string1);
        System.out.println("string2 = " + string2);
        System.out.println("string3 = " + string3);
        System.out.println("string4 = " + string4);


    }
}
