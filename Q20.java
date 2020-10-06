import java.util.Scanner;


public class Q20{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no.:");
        int i= sc.nextInt();
        System.out.println("Enter The 2nd no.:");
        int j=sc.nextInt();
        int count=0;
        for(int k=i;k<=j;k++){
            for(int o=1;o<=k;o++){
                if(k%o==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Prime no.="+k);
            }
            count=0;
        }

    }
}