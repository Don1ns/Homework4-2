public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int userAge = 10;
        if (userAge >= 18){
            System.out.println("Поздравляем с совершеннолетием!");
        }
        else{
            System.out.println("Вам нет 18 лет :(");
        }

        System.out.println("Задача 2");
        int age = 32;
        if ((age >= 7) && (age <18)){
            System.out.println("Вы учитесь в школе");
        }
        else{
            if ((age >= 18) && (age <24)){
                System.out.println("Вы закончили школу, отправляйтесь в университет");
            }
            else{
                System.out.println("Вы закончили университет, и пора искать первую работу");
            }
        }


        System.out.println("Задача 3");
        int totalSeats = 102;
        int seatPlace = 60;
        int standingPlace = totalSeats - seatPlace;
        int occupiedSeatPlace = 60;
        int occupiedStandingPlace = 41;
        if (occupiedStandingPlace + occupiedSeatPlace < totalSeats){
            if(occupiedSeatPlace < seatPlace){
                System.out.println("Есть сидячие места");
            }
            else{
                System.out.println("Есть стоячие места");
            }
        }
        else{
            System.out.println("Все места заняты");
        }
    }
}