package polymorphism;
//polymorphism means many forms.
//there are two types of polymorphism:
//1- Compiletime Polymorphism
//2- Runtime polymorphism


class Shape {

    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing rectangle");
    }
    int add(int a,int b){
        return a+b;
    }
    //method overloading

    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class ShapeExample {
    public static void main(String[] args) {
        Rectangle rect=new Rectangle();
        rect.draw();
        Circle cir=new Circle();
        cir.draw();
        System.out.println(rect.add(8,7));
        System.out.println(rect.add(5,7,1));

    }
}
