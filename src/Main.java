//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        System.out.println("Задача 1");

        int clientOS = 2;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Версии приложения не существует");
        }

        System.out.println("Задача 2");

        int client = 2;
        int clientDeviceYear = 2014;

        if (client == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (client == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (client == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (client == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Версии приложения не существует");
        }

        System.out.println("Задача 3");

        int year = 2024;

        if (year > 1584 && (year % 4 == 0 && year % 100 > 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задача 4");

        int deliveryDistance = 90;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 день." );
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2 дня." );
        } else  if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3 дня." );
        } else {
            System.out.println("Доставки нет." );
        }

        System.out.println("Задача 5");

        int monthNumber = 13;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Время года зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года осень.");
                break;
            default:
                System.out.println("Месяца не существует");
        }
    }
}