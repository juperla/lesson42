package lesson4;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int n, s, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite chislo: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            b = n;
            s = 0;
            while (n != 0) {
                s = s + n % 10;
                n = n / 10;
            }
            System.out.println("Summa sifr chisla " + b + " = " + s);
        }
    }
}

