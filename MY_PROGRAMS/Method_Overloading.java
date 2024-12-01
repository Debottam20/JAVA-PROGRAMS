package MY_PROGRAMS;

public class Method_Overloading {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Method_Overloading sum = new Method_Overloading();
        System.out.println("Sum of 2 and 3: " + sum.add(2, 3)); 
        System.out.println("Sum of 1, 2, and 3: " + sum.add(1, 2, 3)); 
        System.out.println("Sum of 1.5 and 2.5: " + sum.add(1.5, 2.5)); 
    }
}