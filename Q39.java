
import java.util.Scanner;

class Product{
    public int pid;
    public int price;
    public int quantity;
    static int total=0;
   

    Product(int i,int j,int k){
        this.pid=i;
        this.price=j;
        this.quantity=k;
        total=total+(this.quantity*this.price);
    }
    static int gross(){
        
        return total;
    }
}

public class Q39{
    public static void main(String[] args) {
        Product arr[]=new Product[5];
        for(int i=0;i<5;i++){
            int a,b,c;
            System.out.println("Enter the values of pid,price,quantity of 5 Products:");
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            Product z=new Product(a,b,c);
            arr[i]=z;

        }
        int highest=arr[0].price;
        int count=0;
        int count1=0;
        for(Product i : arr){
            if(highest < i.price){
                highest=i.price;
                count=count1;
            }
            count1++;
        }
        System.out.println("The highest price is:"+highest+" with pid of:"+arr[count].pid);
        System.out.println("The total price spent is="+Product.gross());
    }
}