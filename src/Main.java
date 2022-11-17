import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2000;
        System.out.println(year + (isLeap(year) ? " год является високосным": " год не является високосным"));

        System.out.println("Задание 2");
        int clientDeviceYear = 2011;
        int clientOS = 1;
        offerApp(clientDeviceYear, clientOS);

        System.out.println("Задание 3");
        double deliveryDistance = 200;
        System.out.println("Потребуется дней: " + countDays(deliveryDistance));
    }
    private static boolean isLeap(int year) {
        if ((year % 4) == 0 && (year % 100) != 0) {
            return true;
        } else if ((year % 4) == 0 && (year % 400) == 0) {
            return true;
        } else return false;
    }

    private static void offerApp(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения  iOS по ссылке");
        }else if (clientOS == 0 && clientDeviceYear <= currentYear){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения  Android по ссылке");
        }else if (clientOS == 1 && clientDeviceYear <= currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    private static double countDays(double deliveryDistance) {
        int initialDistance = 20;
        int addDayDistance = 40;
        double countDays = (deliveryDistance + initialDistance) / addDayDistance;
        return (int)Math.ceil(countDays);
    }
}