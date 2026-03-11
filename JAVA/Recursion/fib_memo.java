import java.util.Scanner;

public class fib_memo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=sc.nextInt();
        int f[]=new int[50];
        for(int i=0;i<50;i++)
            f[i]=-1;

        int a=fib(n,f);
        System.out.println(a);
    }
    static int fib(int n,int f[])
    {
        
        if(n<=1)
        {
            f[n]=n;
            return n;
        }
        else{
            if(f[n-2]==-1)
                f[n-2]=fib(n-2,f);
            if(f[n-1]==-1)
                f[n-1]=fib(n-1,f);
            return f[n-2]+f[n-1];
        }
    }
}
