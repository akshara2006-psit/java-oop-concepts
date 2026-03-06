package inheritance;
class Animal {

    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

public class AnimalExample {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.eat();
        obj.bark();
    }
}
