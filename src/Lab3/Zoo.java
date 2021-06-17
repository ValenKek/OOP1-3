package Lab3;

import Lab3.Places.Place;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Place> places;
    {
        places = new ArrayList<>();
    }

    int calculateAllAnimalsFoodExpenses(){
        int result = 0;
        for (var place : places) {
            for (var animal : place.getAnimals()) {
                result += animal.getCost();
            }
        }
        return result;
    }

}
