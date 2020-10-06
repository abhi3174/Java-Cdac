package com.company;


import java.util.Scanner;


public class expression {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i =sc.nextInt();
        int y;
        y=i*i+3*i-7;
        System.out.println("The result is = "+y);

        int j=i++ + ++i;
        System.out.println("The result is = "+j);

        int z =i++ - --j - --i + i++;
        System.out.println("The result is = "+z+" "+i+" "+j);


        boolean a;
        boolean b=true;
        boolean c=false;
        a=b && c ||!(b||c);
        System.out.println("The result is = "+a+" "+b+" "+c);
    }
}
