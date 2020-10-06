
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int i = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a value");
        int j = sc1.nextInt();

        i = i + j;
        j = i - j;
        i = i - j;
        System.out.println("The no are:=" + i + " " + j);
    }
}
