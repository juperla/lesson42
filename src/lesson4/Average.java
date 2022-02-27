package lesson4;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int start;
        int end;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведите начало диапазона чисел: ");
        start = scanner.nextInt();

        System.out.print("Ведите конец диапазона чисел: ");
        end = scanner.nextInt();

        int sum = 0;
        int count = 0;
        int arithmeticMean1 = 0;
        int arithmeticMean2 = 0;

        while (start <= end) {

            sum += start;
            count++;
            ++start;

            arithmeticMean1 = sum / count;

            if (start % 2 == 0) {
                sum += start;
                count++;
                arithmeticMean2 = sum / count;
            }
            ++start;
        }

        System.out.println("Среднее арифметическое = " + arithmeticMean1);
        System.out.println("Среднее арифметическое для четных чисел = " + arithmeticMean2);
    }
}



