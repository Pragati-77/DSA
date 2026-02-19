import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }

    }
    
}
