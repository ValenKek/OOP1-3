package Lab2.DifBetweenClassInterface;

public interface IInterface {
    int variable = 0;
    //int variable;
    void simpleMethod();
    static void staticMethod() {
        System.out.println("Some actions");
    }
    default void simpleDefaultMethod(){
        System.out.println("Some actions");
    }
}
