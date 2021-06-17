package Lab3.Unils;


import Lab3.Animals.Animal;

import java.util.Date;

public class Utils {
    public static void calculateFoodExpenses(Date date, Animal animal){
        var dif = animal.getDate().getTime() - date.getTime();
        int differenceInDays = Math.toIntExact(dif / 3600);

        int result =  differenceInDays * animal.getCost();

        System.out.println("You need -> " + result + "$");
    }
}
