
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Enter a marks");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.println("Enter a marks");
        Scanner sc1 = new Scanner(System.in);
        int j = sc1.nextInt();

        System.out.println("Enter a marks");
        Scanner sc2 = new Scanner(System.in);
        int k = sc2.nextInt();

        System.out.println("Enter a marks");
        Scanner sc3 = new Scanner(System.in);
        int l = sc3.nextInt();

        System.out.println("Enter a marks");
        Scanner sc4 = new Scanner(System.in);
        int m = sc4.nextInt();

        float avg = (float) ((i + j + k + l + m) / 500.0);
        System.out.println("Precentage= " + avg * 100);
    }
}
