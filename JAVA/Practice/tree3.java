package JAVA.Recursion;
import java.util.Scanner;

public class tree3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner("System.in");
        tree3 obj=new tree3();
        obj.f(3);
        sc.close();
    }
    void f(int n)
    {
        if(n>0)
        {

            System.out.print(n+" ");
            f(n-1);
            f(n-1);
        }
    }
}
