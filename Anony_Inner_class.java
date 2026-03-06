class ABC{
    void show(){
        System.out.println("This method is showing");
    }
    void print(){
        System.out.println("This method prints");
    }
    void art(){
        System.out.println("I love old art");
    }
}


public class Anony_Inner_class {
    public static void main(String[] args) {
        ABC obj=new ABC(){
            void art(){
                System.out.println("I love painting");
            }
        };
        obj.art();
    }
}
