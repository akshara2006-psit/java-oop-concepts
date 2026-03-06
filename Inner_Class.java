class I{
    void show(){
        System.out.println("In a show");
    }
    class B{
        void art(){
            System.out.println("I love art");
        }
    }
    static class C{
        void print(){
            System.out.println("wowwww! print");
        }
    }
}

public class Inner_Class {
    public static void main(String[] args) {
        I obj=new I();
        //to access inner class we need obj of upper class
        I.B obj2=obj.new B();
        obj2.art();
        //to access static inner class we did not need obj of upper class
        I.C obj3=new I.C();
        obj3.print();
    }
}
