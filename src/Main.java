public class Main {
    public static void main(String[] args) {
        System.out.println();
        //Задача 1
        System.out.println("Задача 1");
        int clientOC = 0;
    if (clientOC == 0){
        System.out.println("Установите версию приложения для iOS по ссылке");
    }
        else {
        System.out.println("Установите версию приложения для Android по ссылке");
    }
        System.out.println();
    //Задача 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2014;
        int clientOC1 = 0;
        if (clientOC1 == 0 && clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOC1 == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOC1 == 1 && clientDeviceYear < 2015){
                    System.out.println("Уcтановите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
        //Задача 3
        System.out.println("Задача 3");
        int year = 2021;
        if (year>1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 ==0)) {
            System.out.println( year+" год является високосным");
        } else {
            System.out.println( year+" год не является високосным");
        }
        System.out.println();
        //Задача 4
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        if (deliveryDistance <-20){
            System.out.println("Потребуется дней:" + 1);
        } else if (deliveryDistance>20 && deliveryDistance<=60) {
            System.out.println("Потребуется дней:" + 2);
        } else if(deliveryDistance>60 && deliveryDistance<=100){
            System.out.println("Потребуется дней:" + 3);
        } else {
            System.out.println("Доставки нет");}
        System.out.println();
        //Задача 5
        System.out.println("Задача 5");
        int mounthNumber =12;
        switch (mounthNumber){
            case 1 :
            case 2 :
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Не существует такого месяца!");
        }
    }
}