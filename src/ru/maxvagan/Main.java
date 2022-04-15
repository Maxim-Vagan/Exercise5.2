package ru.maxvagan;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

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
        System.out.println();
//        Extra Level
//        Task 5
        System.out.println("Task 5");
        int keyNumber = 1;
        int[][] matrix = new int[3][3];
        int lenMatr = matrix.length;
        for (int i=0;i<lenMatr;i++) {
            matrix[i][i] = keyNumber;
            matrix[i][lenMatr - i - 1] = keyNumber;
        }
        for (int[] row : matrix) {
            for (int col : row)
                System.out.print(col + " ");
            System.out.println();
        }
//        Task 6
        System.out.println("Task 6");
        int[] wrongArray = {5, 4, 3, 2, 1};
        System.out.println("Было");
        System.out.println(Arrays.toString(wrongArray));
        int[] rightArray = Arrays.copyOf(wrongArray, wrongArray.length);
        Arrays.sort(rightArray, 0, wrongArray.length);
        System.out.println("Стало");
        System.out.println(Arrays.toString(rightArray));
//        Task 7
        System.out.println("Task 7");
        wrongArray = new int[]{5, 8, 2, 3, 9};
        System.out.println("Было");
        System.out.println(Arrays.toString(wrongArray));
        int buffNumber = 0;
        for (int i=0; i<wrongArray.length/2; i++) {
            buffNumber = wrongArray[i];
            wrongArray[i] = wrongArray[wrongArray.length - 1 - i];
            wrongArray[wrongArray.length - 1 - i] = buffNumber;
        }
        System.out.println("Стало");
        System.out.println(Arrays.toString(wrongArray));
//        Task 8
        System.out.println("Task 8");
        int[] vectorString = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        boolean isSumSatisfy = false;
        for (int i = 0; i < vectorString.length - 1 && isSumSatisfy == false; i++) {
            for (int j = i; j < vectorString.length && isSumSatisfy == false; j++) {
                isSumSatisfy = vectorString[i] + vectorString[j] == -2;
                if (isSumSatisfy) System.out.println("Сумма числа " + vectorString[i] + " и числа " + vectorString[j] + " равна -2");
            }
        }
//        Task 9
        System.out.println("Task 9");
        for (int i = 0; i < vectorString.length - 1; i++) {
            for (int j = i; j < vectorString.length; j++) {
                if (vectorString[i] + vectorString[j] == -2)
                    System.out.println("Сумма числа " + vectorString[i] + " и числа " + vectorString[j] + " равна -2");
            }
        }
    }
}
