package Homework5;

import java.util.Scanner;

public class Task2 {

    /*"Написати програму в якій користувач вводить з клавіатури число,
        а програма визначає, є вона поліндромом чи ні.
        І виводить цю інформацію на екран."*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        String num = input.nextLine();
        String res = "";
        for (int i = num.length()-1; i>=0; i--){
            res = res + num.charAt(i);
        }
        if (res.equals(num)){
            System.out.println("The number is palindrome");
        }else {
            System.out.println("The number isn't palindrome");
        }

    }
}