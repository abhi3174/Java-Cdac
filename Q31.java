import java.util.Scanner;

class Student{
    private int rno;
    private String name;

    public void setData(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the values for rollno. and name:");
        name=sc.nextLine();
        rno=sc.nextInt();
    }
    public void showData(){
        System.out.println("The roll no. is "+rno+" and the name is "+name);
    }
}
public class Q31{
    public static void main(String[] args) {
        Student a=new Student();
        a.setData();
        a.showData();
    }
}