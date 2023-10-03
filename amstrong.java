import java.util.*;
import java.lang.Math;
class Sum 
{
    Sum()
    {
        Scanner din=new Scanner(System.in);
        int a=din.nextInt();
        int f=a;
        int b=0;
        int c=0;
        while(a>0)
        {
           c=a%10;
           b=b+1;
           a=a/10;
        }
        System.out.println("The total of  digit is "+b);
        double s=0;
        int r=0;
        while(f>0)
        {
            r=f%10;
            s+=Math.pow(r,b);
            f=f/10;
        }
        System.out.println("The amstrong numb is "+s);
    }
}
class amstrong
{
    public static void main (String[] args) 
    {
        Sum obj=new Sum();
    }
    
}
