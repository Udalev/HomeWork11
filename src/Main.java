import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        int year = 2021;
        checkLeapYear(year);
    }
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    public static void task2() {
        int osType = 0;
        int deviceYear = 2014;
        checkInstallationMessage(osType, deviceYear);
    }
    public static void checkInstallationMessage(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (osType == 0 || osType == 1) {
            if (deviceYear >= currentYear) {
                System.out.println("Установите версию приложения для " + (osType == 0 ? "iOS" : "Android") + " по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для " + (osType == 0 ? "iOS" : "Android"));
            }
        } else {
            System.out.println("Неверное значение osType: " + osType);
        }
    }

    public static void task3() {
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1; // Свыше 100 км доставки нет
        }
    }
}