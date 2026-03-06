class Parent {

    static void show() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {

    static void show() {
        System.out.println("Child static method");
    }
}

public class MethodHidingExample {

    public static void main(String[] args) {

        Parent obj = new Child();
        Child obj2=new Child();
        obj2.show();//this prints child static method
        obj.show();//this prints parent static method
    }
}
//static methods are resolved at compile time
//this process refers to method hiding
//Method call depends on reference type, not object type. ->most important