import java.util.*;
public class reverse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("enter size of array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("original array");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("reverse array");
        for(i=n-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}