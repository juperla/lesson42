package lesson4;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        int start;
        int end;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведите начало диапазона чисел: ");
        start = scanner.nextInt();

        System.out.print("Ведите конец диапазона чисел: ");
        end = scanner.nextInt();

        int sum1 = 0;
        int count1 = 0;
        int sum2 = 0;
        int count2 = 0;
        double avarage2 = 0;

        while (start <= end) {
            sum1 += start;
            count1++;
            ++start;

            if (start % 2 == 0) {
                sum2 += start;
                count2++;
                avarage2 = (double) sum2 / count2;
            }
            ++start;
        }

        double avarage1 = (double) sum1 / count1;

        System.out.println("Среднее арифметическое = " + avarage1);
        System.out.println("Среднее арифметическое для четных чисел = " + avarage2);
    }
}



