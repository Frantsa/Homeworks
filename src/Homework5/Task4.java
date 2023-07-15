package Homework5;

import java.util.Scanner;

public class Task4 {
    /*Создать три массива.
Первый будет состоять из следующих имен:
"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб".
Второй будет содержать следующие значения типа int:
10, 12, 14, 16, 18, 20.
Третий будет содержать следующие значения:
"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику".
Пользователь вводит три числа с клавиатуры, которые будут соответствовать
индексам каждого из элементов массивов.
Пример1. после ввода 3,2,1:
На экране должно вывестись следующее сообщение:
"Федя будет идти в магазин в 14:00"
Пример2. после ввода 1,2,3:
На экране должно вывестись следующее сообщение:
"Маша будет идти в тренажерный зал в 14:00"*/

    public static void main(String[] args) {
        String[]  name = {"Petya", "Masha", "Alyona", "Fedya", "Sasha", "Anton", "Gleb"};
        int[] time = {10, 12, 14, 16, 18, 20};
        String[] place ={"school", "shop", "church", "gym","cinema", "health centre"};

        Scanner input = new Scanner(System.in);

        int indexName;
        while (true){
            System.out.println("Select the index in the first array");
            System.out.println("You can choose a number from 0 to " + (name.length - 1));
            int index = input.nextInt();
            if(index >= 0 && index<=name.length){
                indexName = index;
                break;
            }
        }
        int indexTime;
        while (true){
            System.out.println("Select the index in the second array");
            System.out.println("You can choose a number from 0 to " + (time.length - 1));
            int index = input.nextInt();
            if(index >= 0 && index<=time.length){
                indexTime= index;
                break;
            }
        }

        int indexPlace;
        while (true){
            System.out.println("Select the index in the third array");
            System.out.println("You can choose a number from 0 to " + (place.length - 1));
            int index = input.nextInt();
            if(index >= 0 && index<=time.length){
                indexPlace= index;
                break;
            }
        }
        System.out.println(name[indexName] + " will go to " + place[indexPlace] + " at " + time[indexTime]);



    }
}
