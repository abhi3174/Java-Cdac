import java.util.Scanner;
import java.lang.Math;

class MathOperation{
    public int addition(int i,int j){
            return i+j;
    }

    public int subtract(int i,int j){
        return i-j;
    }

    public int multiply(int i ,int j){
        return i*j;
    }

    public double power(int i,int j){
        return Math.pow(i, j);
    }
}

class Q35{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values 2:");
        
        int i=sc.nextInt();
        int j=sc.nextInt();
        MathOperation a=new MathOperation();
        System.out.println("The sum is:"+a.addition(i,j));
        System.out.println("The difference is:"+a.subtract(i,j));
        System.out.println("The multiplication is:"+a.multiply(i,j));
        System.out.println("The power is:"+a.power(i,j));
    }
}