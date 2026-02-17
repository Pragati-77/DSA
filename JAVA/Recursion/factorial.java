package JAVA.Recursion;

import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=sc.nextInt();
        int a=fact(n);
        System.out.println(a);
    }
    static int fact (int n)
    {
        if(n==0)
            return 1;
        else
        {
            return n*fact(n-1);
        }
    }
}
