//InheritanceExample
// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound(); // Parent class method
        d.bark();  // Child class method
    }
}