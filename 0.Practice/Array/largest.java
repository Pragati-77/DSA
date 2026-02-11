import java.util.*;

public class largest {

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
            int g=a[0];
        for(i=1;i<n;i++)
        {
            if(a[i]>g)
            {
                g=a[i];
            }
        }
        System.out.println("greatest element is:"+g);
        
    }
}
