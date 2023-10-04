import java.util.*;
class java
{
    java()
    {
    Scanner din=new Scanner(System.in);
    int a=din.nextInt();
    int b=0;
    for(int i=2;i<a;i++)
    {
     if(a%i==0)
        {
         b=b+1;
        }
    }
        if(b==0)
        {
            System.out.println(a+"is a prime numbr");
        }
    
        else
        {
            System.out.println(a+"is a not prime numbr");
        }
    }
    
}
class for1
{
    public static void main (String[] args)
    {
    java c1=new java();
    }
}
