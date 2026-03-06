package interfaces_demo;

public interface X {
    void sound();

}

public interface Y {
    void eat();

}

class Z implements X, Y {
    public void sound() {
        System.out.println("Each animal have different sounds");
    }

    public void eat() {
        System.out.println("Each animal can be caracterised into different types based on their eating behaviour");
    }
}
// the diamond problem in java was solved with the help of interface as class
// could not inherit from two parents therefore multiple inheritance was not possible

public class MultipleInheritance {
    public static void main(String[] args) {
        Z obj = new Z();
        obj.eat();
        obj.sound();

    }
}
