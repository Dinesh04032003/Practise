import java.util.*;
class samp
{
    samp()
    {
       Scanner din=new Scanner(System.in);
       System.out.println("Enter the character");
       int c=din.nextInt();
       
       if(c%2==0)
       {
           if(c<5)
           {
               System.out.println("i");
           }
           else if(c>=6 && c<=20)
           {
               System.out.println("ii");
           }
           else
           {
               System.out.println("iii");
           }
       }
       else
       {
           System.out.println("odd");
       }
    }
}
class ifif
{
    public static void main(String args[])
    {
        samp c1=new samp();
    }
}