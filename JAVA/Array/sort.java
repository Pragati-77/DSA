// package JAVA.Array;

import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int s=a[0];
        for(i=1;i<n;i++)
        {
            if(a[i]<s)
            {
                System.out.println("not sorted");
                break;
            }
            else{
                System.out.println("sorted");   
                break;
            }
        }
    }
}
