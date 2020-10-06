import java.util.Scanner;

import javax.print.event.PrintJobListener;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temp:-");
        int i = sc.nextInt();
        float c = (float) (5 * (i - 32) / 9.0);
        System.out.println("Temp in cel:-" + c);
    }
}
