import java.util.Scanner;

class Student{
    static int count=0;
    private int rno;
    private String name;
    public void setData(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the values for rollno. and name:");
        name=sc.nextLine();
        rno=sc.nextInt();
        count=count+1;
    }
    public void showData(){
        System.out.println("The roll no. is "+rno+" and the name is "+name);
    }
    public void showObj(){
        System.out.println("The no of objects created are:"+count);
    }
}
public class Q32{
    public static void main(String[] args) {
        Student a=new Student();
        a.setData();
        a.showData();
        a.showObj();
    }
}