import java.util.*;
class Sum 
{
    Sum()
    {
        Scanner din=new Scanner(System.in);
        int a=din.nextInt();
        int f=a;
        int b=0;
        int c=0;
        int i=1;
        int d=100;
        while(a>0)
        {
           c=a%10;
           b=b*10+c;
           a=a/10;
        }
    System.out.println("The reverse of "+f+" is "+b);
    }
}
class reverse
{
    public static void main (String[] args) 
    {
        Sum obj=new Sum();
    }
    
}
