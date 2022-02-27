package lesson4;

public class Person {

    private String familyName;
    private String name;
    private String middleName;
    private int age;

    public Person(String familyName, String name, String middleName, int age) {
        this.familyName = familyName;
        this.name = name;
        this.middleName = middleName;
        this.age = age;
    }

    public void printName() {
        System.out.println("Имя: " + name);
    }

    public void printAge() {
        System.out.println("Год рождения: " + (2022 - age));
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2) {
            this.name = name;
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }
}
