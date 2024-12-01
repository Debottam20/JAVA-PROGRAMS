package LAB.DAY_2;
/* Write a simple Java class named Car with attributes like make, model, and year.  Include a method to display the car's details. */
import java.util.*;
class Car {
    String maker;
    String model;
    int year;
    Car(String maker, String model, int year) {
        this.maker = maker;
        this.model = model;
        this.year = year;
    }
    public void display() {
        System.out.printf("Car's details : \nCompany : %s\nModel : %s\nYear : %d\n",maker,model,year);
    }
}
public class CarMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the company : ");
        String Company = in.next();
        System.out.println("Enter the name of the model : ");
        String model = in.next();
        System.out.println("Enter the year of launch : ");
        int year= in.nextInt();
        Car c1 = new Car(Company, model, year);
        c1.display();
    }
}