package lesson4;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int start;
        int end;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начало диапазона чисел: ");
        start = scanner.nextInt();

        System.out.print("Введите конец диапазона чисел: ");
        end = scanner.nextInt();

        int sum1 = 0;
        int count1 = 0;
        int sum2 = 0;
        int count2 = 0;

        while (start <= end) {
            sum1 += start;
            count1++;

            if (start % 2 == 0) {
                sum2 += start;
                count2++;
            }
            ++start;
        }

        double average1 = (double) sum1 / count1;
        double average2 = (double) sum2 / count2;
        System.out.println("Среднее арифметическое = " + average1);
        System.out.println("Среднее арифметическое для четных чисел = " + average2);
    }
}



