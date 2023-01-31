public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия," +
                    " нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 20;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 120;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 3;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");

        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 23;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int numberSeat = 15;
        if (numberSeat > 0 && numberSeat <= 60) {
            System.out.println("У вас " + numberSeat + " место. Это место сидячее");
        } else if (numberSeat > 60 && numberSeat <= 102) {
            System.out.println("У вас " + numberSeat + " место. Это место стоячее");
        } else {
            System.out.println("К сожалению свободных мест нет, вагон полностью забит");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 785;
        int two = 78;
        int three = 432;
        if (one > two && one > three) {
            System.out.println(one + " - самое большое число");
        } else if (two > one && two > three) {
            System.out.println(two + " - самое большое число");
        } else {
            System.out.println(three + " - самое большое число");
        }
    }
}