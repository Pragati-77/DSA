// package JAVA.Searching;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of elements in array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,first,last,mid;
        System.out.println("enter elments");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter element to be searched");
        int s=sc.nextInt();
        first=0;
        last=n-1;
        mid=(first+last)/2;
        while (first <= last) {
            mid = (first + last) / 2;

            if (a[mid] == s) {
                System.out.println("Element found at index: " + mid);
                return;
            } 
            else if (s < a[mid]) {
                last = mid - 1;
            } 
            else {
                first = mid + 1;
            }
        }
    }
}
