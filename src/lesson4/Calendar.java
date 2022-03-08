package lesson4;
import lesson4.Person;
import java.util.Scanner;

public class Calendar {

    public static int year;
    private int month;
    private int day;

    public Calendar(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void printYear() {
        System.out.println("Год рождения: " + year);
    }

}