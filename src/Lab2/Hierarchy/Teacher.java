package Lab2.Hierarchy;

import Lab2.Hierarchy.WorkStrategy.TeacherWork;
import Lab2.Hierarchy.WorkStrategy.WorkStrategy;

public class Teacher extends Human {
    public Teacher(WorkStrategy workStrategy, String name) {
        super(new TeacherWork(), name);
    }
}
