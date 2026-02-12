import java.util.*;
public class sum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("enter size of array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("sum of elements:"+ sum);
    }
}