package lesson4;

import java.util.Scanner;

public class ArithmeticMeanEvenNumbers {
    public static void main(String[] args) {
        int i;
        int n;
        int sum = 0;
        int count = 0;
        int arithMean1 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведите начало диапазона чисел: ");
        i = scanner.nextInt();

        System.out.print("Ведите конец диапазона чисел: ");
        n = scanner.nextInt();

        while (i <= n) {
            sum += i;
            count++;
            ++i;

            arithMean1 = sum / count;
        }
        System.out.print("Среднее арифметическое = " + arithMean1);

        int arithMean2 = 0;
        int j;
        int k;
        int sum1 = 0;
        int count1 = 0;

        System.out.println("Введите начало диапазона чисел: ");
        j = scanner.nextInt();

        System.out.print("Введите конец диапазона чисел: ");
        k = scanner.nextInt();

        while (j <= k) {
            if (j % 2 == 0) {
                sum1 += j;
                count1++;

                arithMean2 = sum1 / count1;
            }
            j++;
        }
        System.out.println("Среднее арифметическое = " + arithMean2);
    }
}



