import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        System.out.println("Enter the principal:");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        System.out.println("Enter the rate:");
        Scanner sc1 = new Scanner(System.in);
        int r = sc1.nextInt();

        System.out.println("Enter the time:");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();

        float i;
        i = (float) (p * r * n / 100.0);
        System.out.println("Interset:-" + i);
        char a = 'a';
        int p1 = a;
        System.out.println(p1);
    }

}
