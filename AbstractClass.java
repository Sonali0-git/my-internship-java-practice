abstract class Animal {
    abstract void sound(); // abstract method (no body)

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
        obj.sleep();
    }
}