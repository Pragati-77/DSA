import java.util.*;
public class reverse {
    static int r=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=sc.nextInt();
        rev(n);
        System.out.println(r);
    }
    static void rev(int n)
    {
        if(n==0)
            return ;
        else 
        {

            r=r*10+(n%10);
            rev(n/10);
            
        }
    }

}
