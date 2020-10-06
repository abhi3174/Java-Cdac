import java.util.*;
class Student{
    public int roll;
    public String name;
    public Student(){
        //this(int i,String j);
        System.out.println("in non-para");
    }
    public Student(int i,String k){
        this();
        roll=i;
        name=k;
        System.out.println("in para");
        
    }
    public void showData(){
        System.out.println(roll);
        System.out.println(name);
    }
}
public class Q41{
    public static void main(String[] args) {
        Student a=new Student(1,"Abhi");
        a.showData();
    }
}