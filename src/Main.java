public class Main {
    public static void main(String[] args) {

        //Задание-1.
        System.out.println("Задание-1.");

        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        //Задание-2.
        System.out.println("Задание-2.");

        int clientDeviceYear = 2015;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылкею.");
            } else if (clientDeviceYear <= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылкею.");
            } else if (clientDeviceYear <= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }

        //Задание-3.
        System.out.println("Задание-3.");

        int year = 2024;

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        }else {
            System.out.println(year + " год не является високосным.");
        }

        //Задание-4.
        System.out.println("Задание-4.");

        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >=20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (deliveryDays * 2));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (deliveryDays * 3));
        }

        //Задание-5.
        System.out.println("Задание-5.");

        int monthNumber = 12;
         switch (monthNumber) {
             case 1:
                 System.out.println("1 месяц (он же январь) принадлежит к сезону зима.");
                 break;
             case 2:
                 System.out.println("2 месяц (он же февраль) принадлежит к сезону зима.");
                 break;
             case 3:
                 System.out.println("3 месяц (он же март) принадлежит к сезону весна.");
                 break;
             case 4:
                 System.out.println("4 месяц (он же апрель) принадлежит к сезону весна.");
                 break;
             case 5:
                 System.out.println("5 месяц (он же май) принадлежит к сезону весна.");
                 break;
             case 6:
                 System.out.println("6 месяц (он же июнь) принадлежит к сезону лето.");
                 break;
             case 7:
                 System.out.println("7 месяц (он же июль) принадлежит к сезону лето.");
                 break;
             case 8:
                 System.out.println("8 месяц (он же август) принадлежит к сезону лето.");
                 break;
             case 9:
                 System.out.println("9 месяц (он же сентябрь) принадлежит к сезону осень.");
                 break;
             case 10:
                 System.out.println("10 месяц (он же октябрь) принадлежит к сезону осень.");
                 break;
             case 11:
                 System.out.println("11 месяц (он же ноябрь) принадлежит к сезону осень.");
                 break;
             case 12:
                 System.out.println("12 месяц (он же декабрь) принадлежит к сезону зима.");
                 break;
             default:
                 System.out.println("Такого месяца не существует");
         }
    }
}