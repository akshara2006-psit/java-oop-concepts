package interfaces_demo;

 interface Animals {
    String  name="hari";
    // in interface we can define variables but by default they are static and final

    void sound;
    //in interface by default all method are public abstract
}
class Dog implements Animals{
    void sound(){
        System.out.println("TH dog barks");
    }
}
public class Animal{
public static void main(String[] args) {
    Dog d1=new Dog();
    d1.sound();
}
}
