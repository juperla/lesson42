package lesson4;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.printf("Наибольшее: %d %n", number1);
            System.out.printf("Наименьшее: %d %n", number2);
        } else {
            System.out.printf("Наибольшее: %d %n", number2);
            System.out.printf("Наименьшее: %d %n", number1);
        }
    }

}
