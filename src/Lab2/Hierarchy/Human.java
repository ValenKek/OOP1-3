package Lab2.Hierarchy;

import Lab2.Hierarchy.WorkStrategy.WorkStrategy;

public abstract class Human {
    WorkStrategy workStrategy;
    String name;

    public Human(WorkStrategy workStrategy, String name) {
        this.workStrategy = workStrategy;
        this.name = name;
    }

    public void work(){
        workStrategy.work();
    }
    public void setWorkStrategy(WorkStrategy workStrategy){
        this.workStrategy = workStrategy;
    }
}
