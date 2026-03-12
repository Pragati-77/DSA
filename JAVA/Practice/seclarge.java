import java.util.*;

public class seclarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;

        for(i=0;i<n;i++)
        {
            if(a[i]>l)
             {
                sl=l;
                l=a[i];
            }
        }
        System.out.println("second largest element is:"+sl);
}
}
