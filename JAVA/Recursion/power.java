// package JAVA.Recursion;

import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base and number of power");
        int x=sc.nextInt();
        int n=sc.nextInt();
        int a=power1(x,n);
        System.out.println(a);
    }
    static int power1(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return(x*power1(x,n-1));
        }
    }
}