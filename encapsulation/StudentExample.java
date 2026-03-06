package encapsulation;
class Student{
    private int marks;
    public void setmarks(int marks){
        this.marks=marks;
    }
    public int getmarks(){
        return marks;
    }
}

//encapsulation refers to binding data in single unit to prevent outside access
//it is good practice to make your variables as private so that no one can access it from outside
public class StudentExample {
    public static void main(String[] args){
        Student obj=new Student();
        obj.setmarks(89);
        int marks=obj.getmarks();
        System.out.println(marks);
    }
}
