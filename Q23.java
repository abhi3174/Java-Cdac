import java.util.Scanner;

public class Q23{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int i = sc.nextInt();
        
        int arr[]=new int[i];
        for(int j=0;j<i;j++){
            arr[j]=sc.nextInt();
        }
        
    }
}