package JAVA.Recursion;
import java.util.Scanner;

public class fibonacii {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner("System.in");
        fibonacii obj=new fibonacii();
        int f=obj.fibo(6);
        System.out.println(f);
        sc.close();

    }
    int fibo(int n)
    {
        if(n<=1)
        return n;
        else
        return fibo(n-2)+fibo(n-1);
    }

}
