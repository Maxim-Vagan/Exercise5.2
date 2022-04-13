package ru.maxvagan;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static int[] funcGenerateRandomArray(int arrayLenght, int beginValue, int endValue) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[arrayLenght];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(endValue-beginValue) + beginValue;
        }
        return arr;
    }
    public static void main(String[] args) {
//        Task 1
        System.out.println("Task 1");
        int[] budgetBookDays = funcGenerateRandomArray(30, 100_000, 200_000);
//        System.out.println(Arrays.toString(budgetBookDays));
        int monthSummary = 0;
        for (final int eachDay : budgetBookDays) monthSummary += eachDay;
        System.out.println("Сумма трат за месяц составила " + monthSummary + " рублей");
//        Task 2
        System.out.println("Task 2");
        int minCostPerMonth = budgetBookDays[0]; int maxCostPerMonth = 0;
        for (int i = 0; i < budgetBookDays.length; i++) {
            minCostPerMonth = Math.min(minCostPerMonth, budgetBookDays[i]);
            maxCostPerMonth = Math.max(maxCostPerMonth, budgetBookDays[i]);
        }
        System.out.println("Минимальная сумма трат за месяц составила " + minCostPerMonth +
                " рублей. Максимальная сумма трат за месяц составила " + maxCostPerMonth + " рублей");
//        Task 3
        System.out.println("Task 3");
        float avgPerMonth = monthSummary / (float)budgetBookDays.length;
        System.out.println("Средняя сумма трат за месяц составила " + avgPerMonth + " рублей");
//        Task 4
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--)
            System.out.print(reverseFullName[i]);
//        В ожидание повышенной сложности
    }
}
