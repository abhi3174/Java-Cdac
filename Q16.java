import java.util.Scanner;

public class Q16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int i = sc.nextInt();
        for(int j=0;j<13;j++){
            System.out.println(j+" * "+i+" = "+i*j);
        }
    }
}