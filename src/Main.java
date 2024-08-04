import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void determineYear(int year){
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            printLeapYear(year);
        } else {
            printNonLeapYear(year);
        }
    }
    public static void printLeapYear(int leapYear){
        System.out.println(leapYear + " год является високосным");
    }
    public static void printNonLeapYear(int nonLeapYear){
        System.out.println(nonLeapYear + " год не является високосным");
    }
    public static void task1() {
        System.out.println("Задача 1");
        int year = 2012;
        determineYear(year);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2016;
        installWhichVersion (clientOS, clientDeviceYear);
    }
    public static void installWhichVersion(int oS, int year) {
        int currentYear = LocalDate.now().getYear();
        if (oS == 0) {
            if (year >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if  (year >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else  {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }
    public static void printDelivery(int days) {
        if (days <= 3) {
            System.out.println("Потребуется дней:" + days);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }
    public static int calculateDaysDelivery(int distance) {
        int deliveryDay = 0;
        if (distance > 0) {
            deliveryDay++;
        }
        if (distance > 20 ) {
            deliveryDay++;
        }
        if (distance > 60) {
            deliveryDay++;
        }
        if (distance > 100) {
            deliveryDay++;
        }
        return deliveryDay;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int deliveryDistance = 55;
        int deliveryDays = calculateDaysDelivery(deliveryDistance);
        printDelivery(deliveryDays);
    }
}