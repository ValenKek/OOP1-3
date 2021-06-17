package Lab2;

import Lab2.Student.Student;
import Lab2.Student.StudentException;
import Lab2.DifBetweenClassInterface.IInterface;
import Lab2.DifBetweenClassInterface.MyClass;
import java.time.Month;
public class main {
    public static void main(String[] args) {
        System.out.println("FIRST");
        System.out.println(getDays(Month.JANUARY));

        System.out.println("\nSECOND");
        try
        {
            Student student = new Student(0,"Mike");
        }
        catch (StudentException studentException)
        {
            System.out.println(studentException.getMessage());
        }
        System.out.println("\nThird");
        IInterface iInterface = null;
        try
        {
            iInterface.simpleMethod();
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        MyClass myClass = new MyClass()
        {
            @Override
            public void simpleAbstractMethod() {
                System.out.println("Some actions");
            }
        };
        myClass.simpleAbstractMethod();

        System.out.println("\nFifth");
        try
        {
            Student student = new Student(18,"Mike");
            System.out.println(student.toString());
            Student.showCounter();

        }
        catch (StudentException e)
        {
            e.printStackTrace();
        }


    }
    public static int getDays(Month month) {
        return month.length(false);
    }
}