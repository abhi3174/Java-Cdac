import java.util.Scanner;

public class Q18{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int i=sc.nextInt();
        int count=0;
        primecheck:
        {
            for(int j=1;j<=(i/2);j++){
                if(i%j==0){
                    count++;
                }
                if(count>2){
                    System.out.println(i+" is not prime.");
                    break primecheck;
                }
                
            }
        }
      if(count<3){
        System.out.println(i+" is prime.");
      }
    }
}