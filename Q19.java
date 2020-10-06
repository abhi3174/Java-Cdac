import java.util.Scanner;

public class Q19{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.:");
        int i= sc.nextInt();
        int sum=0;
        for(int j=1;j<=i;j++){
            sum=sum+j*j;
            System.out.println(j*j);
        }
        System.out.println("The sum of series 12+22+32...+ "+i+" is: "+sum);
    }
}