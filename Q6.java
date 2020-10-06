
import java.util.Scanner;
import java.lang.Math.*;

public class Q6 {

    public static void main(String[] args) {
        System.out.println("Enter a radius");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double area = Math.PI * i * i;
        System.out.println("Area:" + area);
    }
}
