package Homework5;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Tack1 {
    public static void main(String[] args) {
        /*Написати програму, яка зчитуватиме введені користувачем
        слова з клавіатури слова, і склеювати їх в одне речення до тих пір,
        поки користувач не введе з клавітури слово STOP.
        Усі слова, введені до цього, повинні відобразиться в консолі
        одним реченням.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter");
        String word;
        String sentense = " ";
        while (true) {
            System.out.println("Write a word (for the last one, enter STOP)");
            word = input.nextLine();
            sentense += word + " ";
            if (word.equals("STOP")) {
                break;
            }

            System.out.println(sentense);
        }


    }
}
