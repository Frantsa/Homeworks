package Homework4;

import java.util.Date;
import java.util.Scanner;

public class Tack3 {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.println("Enter the year of birth");
        int yearOfBirth = year.nextInt();
        Date dataToday = new Date();
        System.out.println(dataToday);

        String yearToday = String.format("%tY", dataToday);
        System.out.println("Your age is: " + (Integer.parseInt(yearToday) - yearOfBirth));


    }
}
