public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int age = 15;
                if (age >= 18) {
                    System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний ");
                } else {
                    System.out.println("Если возраст человека равен " + age + ", то он не совершеннолетний, нужно немного подождать");
                }

        System.out.println("Задание 2");
                int temp = 15;
                if (temp < 5) {
                    System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
                } else {
                    System.out.println("На улице " + temp + " градусов, можно идти без шапки");
                }

        System.out.println("Задание 3");
                int speed = 120;
                if (speed > 60) {
                    System.out.println("Если скорость " + speed + ", то придется заплатить штраф ");
                } else {
                    System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
                }

        System.out.println("Задание 4");
                int yearsMan = 32;
                boolean kindergarten = yearsMan >= 2 && yearsMan <= 6;
                boolean school = yearsMan >= 7 && yearsMan <= 17;
                boolean university = yearsMan >= 18 && yearsMan <= 24;
                boolean work = yearsMan > 24;

                if (kindergarten) {
                    System.out.println("Если возраст человека равен " + yearsMan + ", то ему нужно ходить в детский сад.");
                } else if (school) {
                    System.out.println("Если возраст человека равен " + yearsMan + ", то ему нужно ходить в школу");
                } else if (university) {
                    System.out.println("Если возраст человека равен " + yearsMan + ", то ему нужно ходить в университет");
                } else if (work) {
                    System.out.println("Если возраст человека равен " + yearsMan + ", то ему нужно ходить на работу");
                }

        System.out.println("ЗАдание 5");
                int ageChild = 11;
                boolean adult = true;
                boolean young = ageChild < 5;
                boolean needsAdult = ageChild >= 5 && ageChild < 14;
                boolean alone = ageChild >= 14;
                if (young) {
                    System.out.println("Если возраст ребенка равен " + ageChild + ", то он не может кататься на аттракционе");
                } else if (needsAdult) {
                    if (adult) {
                        System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься на аттракционе в сопровождении взрослого");
                    } else {
                        System.out.println("Если возраст ребенка равен " + ageChild + ", то он не может кататься на аттракционе без сопровождения взрослого");
                    }
                } else if (alone) {
                    System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься на аттракционах без сопровождения взрослого");
                }

        System.out.println("Задание 6");
                int totalCapacity = 102;
                int seating = 60;
                int passengers = 34;
                boolean freeSeats = passengers < seating;
                boolean standing = passengers >= seating && passengers <= totalCapacity;
                boolean full = passengers == totalCapacity;
                boolean noPlaces = passengers > totalCapacity;
                if (freeSeats) {
                    System.out.println("В вагоне есть свободные сидячие места, так как в нем находятся " + passengers + " пассажиров");
                } else if (standing) {
                    System.out.println("В вагоне остались только стоячие места, так как в нем находятся " + passengers + " пассажиров");
                } else if (full) {
                    System.out.println("В вагоне полностью заполнен, так как в нем находятся " + passengers + " пассажиров");
                } else if (noPlaces) {
                    System.out.println("Превышена максимальная вместимость вагона, так как в нем находятся " + passengers + " пассажиров");
                }

        System.out.println("Задание 7");
                int one = 10;
                int two = 20;
                int three = 30;
                if (one >= two && one>= three) {
                    System.out.println("Число " + one + " больше остальных");
                } else if (two >= one && two >=  three) {
                    System.out.println("Число " + two + " больше остальных");
                } else {
                    System.out.println("Число " + three + " больше остальных");
                }

        }
    }
