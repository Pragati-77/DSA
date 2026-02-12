package JAVA.Recursion;
import java.util.Scanner;

public class nested6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner("System.in");
        nested6 o=new nested6();
        int f=o.fun(95);
        System.out.println(f);
        sc.close();
    }
    int fun(int n)
    {
        if(n>100)
        return(n-10);
        else 
        return fun(fun(n+11));
    }
}
