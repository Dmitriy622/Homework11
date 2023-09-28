import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        printInfoAboutYear(2023);
        System.out.println("Задание 2");
        printInfoAboutVersion(1, 2021);
        System.out.println("Задание 3");
        int deliveryDays = calculateDeliveryDays(100);
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней:" + deliveryDays);
        } else {
            System.out.println("Доставки нет!");
        }
    }

    static void printInfoAboutYear(int year) {
        if (year % 4 == 0  && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }
    }

    static void printInfoAboutVersion (int os, int releaseYear) {
        if (os != 0 && os != 1) {
            System.out.println("Некорректная ОС!");
            return;
        }
        int currentYear = LocalDate.now().getYear();
        StringBuilder stringBuilder = new StringBuilder("Установите ");
        if (releaseYear < currentYear) {
            stringBuilder.append("облегченную ");
        }
        stringBuilder.append("версию приложения для ");
        if (os == 0) {
            stringBuilder.append("iOS ");
        }else {
            stringBuilder.append("Android ");
        }
        stringBuilder.append("по ссылке");
        System.out.println(stringBuilder);
    }

    static int calculateDeliveryDays(int distance) {
        if (distance < 0 || distance > 100) {
            return -1;
        }
        int days = 1;
        if (distance > 20) {
            days++;
        }
        if (distance > 60) {
            days++;
        }
        return days;
    }
}