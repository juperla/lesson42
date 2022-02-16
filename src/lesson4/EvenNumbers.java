package lesson4;

import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        long number = scanner.nextInt();

        long sum = 0;
        int numb = 0;
        String strNumber = Long.toString(number);
        for (int i = 0; i < strNumber.length(); i++) { //Цикл от 0 до количества символов
            numb = strNumber.charAt(i) - '0'; //Получить строковый символ по индексу. -'0' необходим для перевода в тип int
            if (numb % 2 == 0) { // Проверить четность числа
                sum += numb; //Суммировать число
            }
        }
        System.out.println("Сумма всех четных цифр = " + sum);
    }

}
