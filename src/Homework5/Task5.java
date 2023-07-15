package Homework5;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    /*5)Есть одномерный массив из 10 элементов, заполнен-
    ный случайными числами. Пользователь вводит с клавиатуры
    число. Программа показывает есть ли такое число в созданном
    до этого массиве.*/
    public static void main(String[] args) {
        int[] arrayRandNumb = new int[10];
        Random random = new Random();

        for (int i = 0; i < arrayRandNumb.length; i++) {
            arrayRandNumb[i] = random.nextInt(100);
            System.out.println(arrayRandNumb[i]);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();

        boolean found = false;
        for (int i = 0; i < arrayRandNumb.length; i++) {
            if (arrayRandNumb[i] == num){
                found = true;
                break;
            }
        }
         if (found){
             System.out.println("The number "+ num +  " found in array.");
         }else {
             System.out.println("The number "+ num +  " not found in array.");

         }


    }
}
