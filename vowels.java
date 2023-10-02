import java.util.*;
class samp
{
    samp()
    {
       Scanner din=new Scanner(System.in);
       System.out.println("Enter the character");
       char c=din.next().charAt(0);
       
       if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
       {
           System.out.println("vowels");
       }
       else
       {
           System.out.println("constants");
       }
    }
}
class vowels
{
    public static void main(String args[])
    {
        samp c1=new samp();
    }
}