import java.util.*;
class samp
{
    samp()
    {
       Scanner din=new Scanner(System.in);
       System.out.println("Enter the number");
       int a=din.nextInt();
       if(a==0)
       {
           System.out.println("zero");
       }
       else if(a%2==0)
       {
           System.out.println("Even number");
       }
       else
       {
           System.out.println("Odd number");
       }
    }
}
class even
{
    public static void main(String args[])
    {
        samp c1=new samp();
    }
}