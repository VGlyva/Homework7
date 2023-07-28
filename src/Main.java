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

    }

    public static void task1() {
        System.out.println("Задача 1");
        int deposit = 15000;
        int total = 0;
        for (int i = 1; total < 2_459_000; i++) {
            total = total + deposit;
            total = total + total / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int start = 10;
        while (start > 0) {
            System.out.print(start + " ");
            start = start - 1;
        }
        System.out.println();
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int growthYear = fertility - mortality;
        for (int i = 1; i <= 10; i++) {
            population = population + population * growthYear / 1000;
            System.out.println("Год " + i + ", численность населения составляет " + population + " человек.");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deposit = 15000;
        int total = 0;
        for (int i = 1; total < 12_000_000; i++) {
            total = total + total / 100 * 7;
            total = total + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15000;
        int total = 0;
        for (int i = 1; total < 12_000_000; i++) {
            total = total + total / 100 * 7;
            total = total + deposit;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
            }
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
        int deposit = 15000;
        int total = 0;
        for (int i = 1; i <= 108; i++) { // 9 лет = 108 месяцев
            total = total + total / 100 * 7;
            total = total + deposit;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
            }
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        int reportingDay = 2;
        while (reportingDay < 31) {
            System.out.println("Сегодня пятница, " + reportingDay + "-е число. Необходимо подготовить отчёт.");
            reportingDay = reportingDay + 7;
        }
        System.out.println();
    }
    public static void task8() {
        System.out.println("Задача 8");
        int current = 2023;
        int toTheCurrent = current - 200;
        int afterTheCurrent = current + 100;
        for (int i = 0; i <= afterTheCurrent; i = i + 79) {
            if (i > toTheCurrent && i < afterTheCurrent)
                System.out.println(i);
            }
        }
    }



