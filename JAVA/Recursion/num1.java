package JAVA.Recursion;
import java.util.*;

public class num1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=sc.nextInt();
        number(n);
    }
    static void number(int n)
    {
        if(n==0)
            return;
        else
        {
            System.out.println(n);
            number(n-1);
        }
    }
}
