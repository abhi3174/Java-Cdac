import java.util.*;

class OneBhk{
    int roomArea,hallArea,price;
    static int totalPrice=0;

    OneBhk(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of roomArea,hallarea,price:");
        this.roomArea=sc.nextInt();
        this.hallArea=sc.nextInt();
        this.price=sc.nextInt();
        totalPrice=totalPrice+price;
    }
     OneBhk(int i,int j,int k){
        this.roomArea=i;
        this.hallArea=j;
        this.price=k;
        totalPrice=totalPrice+price;
    }
    public void show(){
        System.out.println("The OneBHK area is: "+this.roomArea+" "+this.hallArea+" "+this.price);
    }
}
class TwoBhk extends OneBhk{
    
    int room2Area,roomArea,hallArea,price;
    TwoBhk(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of roomArea,room2Area,hallarea,price:");
        
        this.room2Area=sc.nextInt();
        
        totalPrice=totalPrice+price;
    }
     TwoBhk(int i){
        
        this.room2Area=i;
        totalPrice=totalPrice+price;
    }
    public void show(){
        System.out.println("The OneBHK area is: "+this.roomArea+" "+this.room2Area+" "+this.hallArea+" "+this.price);
    }
}

public class Q43{
    public static void main(String[] args) {
        OneBhk a=new OneBhk(100,200,300);
        OneBhk b=new OneBhk(100,200,300);
        TwoBhk c=new TwoBhk(300);
        TwoBhk d=new TwoBhk(300);
        System.out.println(OneBhk.totalPrice);
        System.out.println(TwoBhk.totalPrice);
    }
}