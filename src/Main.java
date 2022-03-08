


import lesson4.Person;
import lesson4.Calendar;

public class Main {
    private static Object Calendar;

    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Петр", "Михайлович", 23);
        Calendar = new Calendar(2022, 3, 8);
        person1.printName();
        person1.printAge();

        Person person2 = new Person("Иванова", "Наталья", "Викторовна", 56);
        Calendar = new Calendar(2022, 3, 8);
        person2.printName();
        person2.printAge();

    }
}