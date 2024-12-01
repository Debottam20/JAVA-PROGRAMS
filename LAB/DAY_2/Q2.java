package LAB.DAY_2;
/* Create a base class Animal with a method make Sound (). Derive a class Dog from  Animal that overrides make Sound () to print "Bark". */
class Animal {
    public void makeSound() {
        System.out.println("Animal making sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
public class Q2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();
        Animal d = new Dog();
        d.makeSound();
    }
}