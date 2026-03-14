import java.util.*;
public class gcdnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=gcd(a,b);
        System.out.println(c);
    }
    static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}
