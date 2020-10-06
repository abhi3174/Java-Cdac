import java.util.Scanner;

class Tile{
    int titleLength;
    public void ttleng(){
        System.out.println("Enter the length of the square tile:");
        Scanner sc=new Scanner(System.in);
        titleLength = sc.nextInt();
    }
}

class Room extends Tile{
    int leng,bred;
    public void roomDetails(){
        System.out.println("Enter the length and breadth of room:");
        Scanner sc=new Scanner(System.in);
        leng=sc.nextInt();
        bred=sc.nextInt();
    }
    public void totalTiles(){
        ttleng();
        roomDetails();
        System.out.println("The total tiles required are:"+(leng*bred)/(titleLength*titleLength));
    }
}

public class Q42{
    public static void main(String[] args) {
        Room a=new Room();
        a.totalTiles();
    }
}