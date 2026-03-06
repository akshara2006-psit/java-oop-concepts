abstract class Vehicle{

    //abstarct method
    //abstract method is only description 
    abstract void start();
    //concrete method
    void stop(){
        System.out.println("Vehicle stopeed after pressing break");
    }
}
class Car extends Vehicle{
    
    public void start(){
        System.out.println("Car starts with a key");
    }
}
class Bike extends Vehicle{
    public void start(){
        System.out.println("Bike starts with a kick or self start");
    }
}
//we can not create object of Vehicle class as it is abstarct class

public class VehicleExample{
public static void main(String[] args){
    Car obj1=new Car();
    obj1.start();
    obj1.stop();

    Bike obj2=new Bike();
    obj2.start();
    obj2.stop();;
}
}