import java.util.*;
import java.lang.Math;
class Sum 
{
    Sum()
    {
        Scanner din=new Scanner(System.in);
        int a=din.nextInt();
        int b=0;
        int i=1;
        while(i<=a)
        {
          if(i%3==0)
          {
           b=b+1;   
          }
          i=i+1;
        }
        System.out.println("The total of  digit is "+b);
    }
}
class whi
{
    public static void main (String[] args) 
    {
        Sum obj=new Sum();
    }
    
}
