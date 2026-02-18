package JAVA.Searching;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no. of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,flag=0;
        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter element to be searched");
        int s=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==s)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("element found at position:"+i);
        else
            System.out.println("element not found");
    }
}
