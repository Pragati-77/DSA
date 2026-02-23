import java.util.Scanner;

public class count_pos_neg {
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
        int cp=0,cn=0;
        for(i=0;i<n;i++)
        {
            if(a[i]<0)
                cn++;
            else
                cp++;
        }
        System.out.println("positive no.:"+cp);
        System.out.println("negative no.:"+cn);
    }    
}
