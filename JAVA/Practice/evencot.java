import java.util.*;
public class evencot {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int n,i;
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
            if(a[i]%2==0)
            {
                c++;
            }
        }
        System.out.println("total even numbers are:"+c);
    }
}
