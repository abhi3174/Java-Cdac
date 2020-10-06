
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        float gs;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary:=");
        int i = sc.nextInt();
        if (i < 10000) {
            float hra = 0.1f;
            float da = 0.9f;
            gs = (float) (i + (i * hra) + i * da);
        } else {
            gs = (float) (i + (i * 0.2) + (i * 0.98));

        }
        System.out.println("The gross salaray=" + gs);
    }

}
