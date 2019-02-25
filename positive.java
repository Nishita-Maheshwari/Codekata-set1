import java.util.*;
public class JavaProgram
{
    public static void main(String[] args)
    {
       int n;
       System.out.println("Enter the number");
       Scanner scan= new Scanner(System.in);
       n=scan.nextInt();
       if(n>0)
       {
           System.out.println(n + " is a positive");
       }
       else if(n<0)
       {
           System.out.println(n + " is a negative");
       }
       else
       {
           System.out.println(n + " is a zero");
       }
    }
}
