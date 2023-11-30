package Ages;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person firstperson = new Person();
        System.out.println("Введите имя первого мужика:");
        firstperson.name = scan.nextLine();
        System.out.println("Введите взраст первого мужика:");
        firstperson.age = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);
        Person secondperson = new Person();
        System.out.println("Ведите имя второго мужика:");
        secondperson.name = scan2.nextLine();
        System.out.println("Ведите возраст второго мужика:");
        secondperson.age = scan2.nextInt();

        System.out.println(firstperson.name + " и " + secondperson.name + " старые, их общий возраст: "
                + (firstperson.age + secondperson.age) + Age.yearsold(firstperson.till()));
        System.out.println("До пенсии " + firstperson.name + " будет работать " + firstperson.till() + " " + Age.yearsold(firstperson.till()) +
                ", а " + secondperson.name + " " + secondperson.till() + Age.yearsold(secondperson.till()));
    }

}

class Person {
    String name;
    int age;

    int till() {
        return 65 - age;
    }
}
