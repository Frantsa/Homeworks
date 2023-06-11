package Homework4;

import java.util.Scanner;

public class Tack2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers than construct a triangle:");
        int a, b, c;
        System.out.println("Length of the first side is ");
        a = input.nextInt();
        System.out.println("Length of the second side is ");
        b = input.nextInt();
        System.out.println("Length of the third side is ");
        c = input.nextInt();

        if ((a<b+c) && (b<a+c) && (c<a+b)){
        System.out.println("You can build a triangle!");
        }
        else{
            System.out.println("You can't build a triangle!");
        }

    }
}
