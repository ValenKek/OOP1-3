package Lab2.Hierarchy;

import Lab2.Hierarchy.WorkStrategy.StudentWork;

public class Student extends Human {
    public Student(String name) {
        super(new StudentWork(), name);
    }
}
