package MY_PROGRAMS;

@FunctionalInterface
interface NumAdder {
    void intro(); // Without arguments
}
@FunctionalInterface
interface Addition {
    void add(int a , int b); // With arguments
}
@FunctionalInterface
interface AdditionWithDecimals {
    double addWithDecimals(double a, double b); // With arguments & return type
}

public class LambdaExprDemo {
    public static void main(String[] args) {
        NumAdder adder = () -> System.out.println("Welcome to NumAdder");
        Addition addition = (int a, int b) -> System.out.println("The sum is : " + (a + b));
        AdditionWithDecimals additionWithDecimals = (double a, double b) -> (a + b);
        adder.intro();
        addition.add(10,9);
        addition.add(30,2);
        addition.add(50,5);
        double result = additionWithDecimals.addWithDecimals(4.5,5.5);
        System.out.println("The sum with decimals is : " + result);
    }
}