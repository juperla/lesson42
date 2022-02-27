

import lesson4.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Петр", "Михайлович", 23);
        person1.printName();
        person1.printAge();

        Person person2 = new Person("Иванова", "Наталья", "Викторовна", 56);
        person2.printName();
        person2.printAge();

    }
}