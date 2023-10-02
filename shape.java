import java.util.*;
class samp
{
    samp()
    {
       Scanner din=new Scanner(System.in);
       System.out.println("Enter the number");
       int l=din.nextInt();
       int b=din.nextInt();
       if(l==b)
       {
           System.out.println("Square");
       }
       else
       {
           System.out.println("rectangle");
       }
    }
}
class shape
{
    public static void main(String args[])
    {
        samp c1=new samp();
    }
}