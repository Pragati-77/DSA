// package JAVA.Recursion;

import java.util.Scanner;

public class sum_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int a=Sum(n);
        System.out.println("sum of digits:"+a);
    }
    static int Sum(int n)
    {
        if(n==0)
            return 0;
        else
        {
          return (n%10) +Sum(n/10);
        }
    }
}
