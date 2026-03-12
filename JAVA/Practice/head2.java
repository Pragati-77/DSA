package JAVA.Recursion;
import java.util.*;
public class head2 {
    void fun(int n)
    {
        if(n>0)
        {
            fun(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        head2 obj=new head2();
        obj.fun(5);
        sc.close();
    }
}
