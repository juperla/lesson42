package lesson4;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        int number;
        int sum = 0;
        int currentDigit;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        number = scanner.nextInt();

        currentDigit = number % 10;
        sum = sum + currentDigit;

        number = number / 10;

        currentDigit = number % 10;
        sum = sum + currentDigit;

        number = number / 10;
        sum = sum + number;

        System.out.println(sum);
    }
}


