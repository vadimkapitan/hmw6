import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 2; i <= 17; i += 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int mounthSaving = 29000;
        int yearSaving = 0;
        for (int i = 0; i < 13; i++) {
            yearSaving = yearSaving + mounthSaving;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + yearSaving + " рублей.");
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        int mounthSaving = 29000;
        int total = 0;
        int yearPercent = 12;
        int mounthPercent = yearPercent / 12;
        for (int i = 0; i < 13; i++) {
            total = total + total * mounthPercent / 100;
            total = total + mounthSaving;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task10() {
        int value = 0;
        System.out.println("задача 10");
        for (int i = 1; i < 11; i++) {
            value = i * 2;
            System.out.println(i + " * 2 = " + value);
        }
    }
}