package JAVA.Recursion;
import java.util.*;

public class num
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no.");
        int n=sc.nextInt();
        printnum(n);
    }
    static void printnum(int n)
    {
        if(n==0)
            return;
        else
        {
            printnum(n-1);
            System.out.println(n);

        }
    }
}