    import java.util.Scanner;

    public class Q21{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size:");
            int i= sc.nextInt();
            int arr[]=new int[i];
            for(int j=0;j<i;j++){
                arr[j]=sc.nextInt();
            }
            int sum=0;double avg=0;
            for(int j=0;j<i;j++){
                sum=sum+arr[j];
        }
        avg=sum/(i*1.0);
        System.out.println("The sum of array elements is: "+sum+".Average is: "+avg);
    }
}