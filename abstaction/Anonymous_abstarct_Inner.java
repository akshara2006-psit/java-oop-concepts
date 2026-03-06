abstract class A{
    abstract void show();

}
public class Anonymous_abstarct_Inner {
    public static void main(String[] args) {
        A obj=new A(){
            void show(){
                System.out.println("in inner class show");
            }
        };
        obj.show();
        //this is anonymous and abstarct inner class
    }
}
