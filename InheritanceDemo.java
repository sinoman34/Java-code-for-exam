class Animal {
    void eat () {
        System.out.println("Animal is eating.");
     }
}
class Dog extends Animal {
    void bark () {
        System.out.println("Dog is barking.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dg1 = new Dog();
        dg1.eat();
        dg1.bark();
    }
}
