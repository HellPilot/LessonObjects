package Ages;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������� ������� �����: ");
        int first = scan.nextInt();
        int second = scan.nextInt();
        int sum = first + second;
        System.out.println("�� ����� �������: " + sum + " " + yearsold(sum));
    }

    static String yearsold(int age) {
        String year = null;
        int number;
        number = age % 10;
        if (age == 11 || age == 12 || age == 13 || age == 14)
            year = "���";
        else
            switch (number) {
                case 1 -> year = "���";
                case 2, 3, 4 -> year = "����";
                case 5, 6, 7, 8, 9, 0 -> year = "���";
            }
        return year;
    }
}

