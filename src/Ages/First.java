package Ages;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person firstperson = new Person();
        System.out.println("������� ��� ������� ������:");
        firstperson.name = scan.nextLine();
        System.out.println("������� ������ ������� ������:");
        firstperson.age = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);
        Person secondperson = new Person();
        System.out.println("������ ��� ������� ������:");
        secondperson.name = scan2.nextLine();
        System.out.println("������ ������� ������� ������:");
        secondperson.age = scan2.nextInt();

        System.out.println(firstperson.name + " � " + secondperson.name + " ������, �� ����� �������: "
                + (firstperson.age + secondperson.age) + Age.yearsold(firstperson.till()));
        System.out.println("�� ������ " + firstperson.name + " ����� �������� " + firstperson.till() + " " + Age.yearsold(firstperson.till()) +
                ", � " + secondperson.name + " " + secondperson.till() + Age.yearsold(secondperson.till()));
    }

}

class Person {
    String name;
    int age;

    int till() {
        return 65 - age;
    }
}
