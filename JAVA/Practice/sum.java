package JAVA.Practice;
import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no.");  //input data
        int n=sc.nextInt();
        int a=Sum(n);
        System.out.println(a);   //print sum
        
    }
    static int Sum(int n)    //recursive method
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
