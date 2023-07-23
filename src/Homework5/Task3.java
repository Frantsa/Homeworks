package Homework5;

import java.util.Scanner;

public class Task3 {
    /*
    3)Написати проограму, умовно для складу прийому металу. Уявімо, що склад
може зберігати певну вагу металу. Користувач вводить із
клавіатури вагу, яка може зберігатися на складі. Далі користувач вводить
з клавіатури вагу, яку умовно збирається здати на склад користувач.
Програма повинна після кожної здачі металу показувати скільки ваги ще може прийняти
склад. Якщо користувач хоче здати металу більше ніж залишилося місця на складі,
то програма не дає йому це зробити і повідомляє користувача про неможливість цієї операції.
Якщо користувач здає метал вагою менше ніж 5, програма теж попереджає
про неможливість приймання такої малої ваги. Програма завершується, коли
місце на складі закінчилося.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many tonnes can the warehouse hold:");
        int maxW = input.nextInt();

        while (maxW >= 0){
            System.out.println("Insert weight to add for warehouse:");
            int weight = input.nextInt();
            if (weight < 5) {
                System.out.println("Forbidden add < 5");
            } else if (maxW - weight < 0) {
                System.out.println("warehouse is full");
            } else if (maxW - weight == 0) {
                System.out.println("Склад заполнен. Конец");
                break;
            } else if (maxW - weight <= 5) {
                System.out.println("Недопустимый остаток на складе");
            } else {
                maxW = maxW - weight;
                System.out.println(maxW + " has left");
            }
        }
    }
}
