import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no.");
        int n=sc.nextInt();
        int a=Sum(n);
        System.out.println(a);
        
    }
    static int Sum(int n)
    {
        int sum=0;
        if(n==0)
            return 0;
        else
        {
            return n+ Sum(n-1);
        }
   
    }
}
