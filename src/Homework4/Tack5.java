package Homework4;

import java.util.Scanner;

public class Tack5 {
    public static void main(String[] args) {
        Scanner dayOfWeek = new Scanner(System.in);
        System.out.println("Enter a day of week");
        int indexDay = dayOfWeek.nextInt();

        if (indexDay == 1) {
            System.out.println("Monday");
        } else if (indexDay == 2) {
            System.out.println("Tuesday");
        } else if (indexDay == 3) {
            System.out.println("Wednesday");
        } else if (indexDay == 4) {
            System.out.println("Thursday");
        } else if (indexDay == 5) {
            System.out.println("Friday");
        } else if (indexDay == 6) {
            System.out.println("Saturday");
        } else if (indexDay == 7) {
            System.out.println("Sunday");
        } else if (indexDay > 7 || indexDay < 1) {
            System.out.println("It would be better if it were Friday!");
        }
    }
}
