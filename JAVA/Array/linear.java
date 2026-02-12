import java.util.*;
public class linear{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s,flag=0;
        int n,i;
        System.out.println("enter size of array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter element to be searched");
        s=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==s)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("element found at location:"+i);
        else
            System.out.println("element not found");
    }
}