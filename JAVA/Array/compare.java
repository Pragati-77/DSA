package JAVA.Array;
import java.util.*;
public class compare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of elements");
        int n=sc.nextInt();
        int i;
        int a[]=new int[n];

        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        int min = a[0];
        int max = a[0];

        for (i = 1; i < n; i++) {

            if (a[i] < min) {
                min = a[i];
            }

            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}
