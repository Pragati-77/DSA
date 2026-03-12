import java.util.Scanner;

public class nCr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n and r");
        int n=sc.nextInt();
        int r=sc.nextInt();
        int a=comb(n,r);
        System.out.println(a);
    }
    static int comb(int n,int r)
    {
        if(r==0 || n==r)
            return 1;
        else
            return comb(n-1,r-1)+comb(n-1,r);
    }
}
