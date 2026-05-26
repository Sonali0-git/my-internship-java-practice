interface Printable {
    void print();
}

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal implements Printable {
    public void print() {
        System.out.println("Dog printing...");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.eat();
        obj.print();
    }
}