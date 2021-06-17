package Lab2.Student;

public class Student {
    int age;
    String name;
    public static int counter = 0;
    public Student(int age, String name) throws StudentException {
        if(age < 18)
            throw new StudentException("Invalid age - must be more than 18");
        this.age = age;
        this.name = name;
        ++counter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    public static void showCounter(){
        System.out.println(counter + " objects have created");
    }
}
