import java.util.Scanner;

public class Q17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be reversed:");
        int i=sc.nextInt();
        int k=0;
        int r=0;
        while(i!=0){
            k=i%10;
            r=r*10+k;
            i=i/10;
        }
        System.out.println("The revesed number is:"+r);
    }
}