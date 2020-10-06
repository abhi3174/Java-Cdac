import java.util.Scanner;

public class Q30{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int arr[][]=new int[3][3];
        for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println("enter ele");
				arr[i][j] = sc.nextInt();
			}
        }
        int sum=0;
        for(int i=-0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println("The sum of the diagonal elements is:"+sum);
    }
}