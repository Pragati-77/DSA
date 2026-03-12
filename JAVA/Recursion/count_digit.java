import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int a=count(n);
        System.out.println(a);
    }
    static int count(int n)
    {
        if(n==0)
            return 0;
        else
            return 1+count(n/10);
    }
}
