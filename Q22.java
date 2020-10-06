import java.util.Scanner;

public class Q22{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int i = sc.nextInt();
        
        int arr[]=new int[i];
        for(int j=0;j<i;j++){
            arr[j]=sc.nextInt();
        }
        int high=0;
        int low=0;
        int exch=0;
        for(int k=0;k<=(arr.length-1);k++){
            for(int l=k+1;l<arr.length;l++){
                if(arr[k]<arr[l]){
                    high=arr[l];
                    arr[l]=arr[k];
                    arr[k]=high;
                }
            }
     
        }
        for(int j=0;j<i;j++){
            System.out.print(" "+arr[j]);
        }
    }
}