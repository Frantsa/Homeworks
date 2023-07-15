package Homework5;

import java.util.Random;

public class Task6 {
    /*6)Заполнить массив на 45 элементов случайными числами
    от -50 до +50. Найти минимальный элемент и вывести его
    на консоль. Найти максимальный элемент и вывести его на
    консоль.*/
    public static void main(String[] args) {
        int[] arrayRandNumb = new int[45];
        Random random = new Random();

        for (int i = 0; i < arrayRandNumb.length; i++) {
            arrayRandNumb[i] = (int) ((Math.random()*101)-50);
        }


        int minValue = arrayRandNumb[0];
        for (int i = 0; i < arrayRandNumb.length; i++) {
            if (arrayRandNumb[i] < minValue) {
                minValue = arrayRandNumb[i];
            }
        }
        System.out.println("\n" + "Minimum value is: " + minValue);


        int maxValue = arrayRandNumb[0];
        for (int i = 0; i < arrayRandNumb.length; i++) {
            if (arrayRandNumb[i] > maxValue) {
                maxValue = arrayRandNumb[i];
            }
        }
        System.out.println("\n" + "Maximum value is: " + maxValue);


        }
    }

