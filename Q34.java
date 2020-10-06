import java.util.Scanner;
import java.lang.Math.*;

class Circle{
    private int radius;
    private float area;

    public void setData(){
        System.out.println("Enter the radius:");
        Scanner sc=new Scanner(System.in);
        this.radius=sc.nextInt();
    }
    public void area(){
        this.area=(float)(Math.PI*this.radius*this.radius);
    }
    public void showData(){
        System.out.println("The area of a circle with radius "+this.radius+" is "+this.area+".");
    }
}
public class Q34{
    public static void main(String[] args) {
        Circle a=new Circle();
        a.setData();
        a.area();
        a. showData();
    }
}