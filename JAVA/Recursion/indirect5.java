package JAVA.Recursion;
import java.util.Scanner;

public class indirect5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner("System.in");
        indirect5 obj=new indirect5();
        int f= obj.fA(20);
        System.out.println(f);
    }
    int fA(int n)
    {
        if(n>0)
        {
            System.out.println(n);
            fB(n-1);
        }
        return 0;
    }
    void fB(int n)
    {
        if(n>1)
        {
            System.out.println(n);
            fA(n/2);
        }
    }

}
