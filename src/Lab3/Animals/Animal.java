package Lab3.Animals;


import Lab3.Behaviors.Behavior;

import java.util.Calendar;
import java.util.Date;

public abstract class Animal {
    static int counter;
    int id;

    String name;
    Behavior behavior;
    Integer cost;
    Date date;

    public String getName() {
        return name;
    }

    public Behavior getBehavior() {
        return behavior;
    }

    public Integer getCost() {
        return cost;
    }

    public Date getDate() {
        return date;
    }

    public Animal(Behavior behavior, Integer cost) {
        this.behavior = behavior;
        this.cost = cost;
        date = Calendar.getInstance().getTime();
        id = ++counter;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", behavior=" + behavior +
                '}';
    }

}
