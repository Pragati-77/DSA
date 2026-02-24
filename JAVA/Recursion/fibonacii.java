package JAVA.Recursion;

import java.util.Scanner;

public class fibonacii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter. element");
        int n=sc.nextInt();
        
        System.out.println(fibo(n));

    }
    static int fibo(int n)
    {
        if(n<=1)
            return n;
        return(fibo(n-1)+fibo(n-2));
    }
    
}
