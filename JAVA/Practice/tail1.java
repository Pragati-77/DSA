package JAVA.Recursion;
import java.util.*;
public class tail1 {
   void fun(int n)
   {
      if(n>0)
      {
         System.out.println(n);
         fun(n-1);
      }
   }
   public static void main(String[] args)   
   {
      Scanner sc=new Scanner(System.in);
      tail1 obj= new tail1();
      obj.fun(5);
      sc.close();
      }
}
