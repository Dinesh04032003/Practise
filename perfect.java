import java.util.*;
class java
{
    java()
    {
    Scanner din=new Scanner(System.in);
    int a=din.nextInt();
    int b=0;
    for (int i=1;i<a;i++)
    {
        
        if (a%i==0)
        {
        b=b+i;
        }
    }
    if(a==b)
    {
        System.out.println(a+" is a perfect number");
    }
    else
    {
        System.out.println(a+" is not a perfect number");
    }
        
    }
}
class perfect
{
  public static void main (String args[])
  {
    java c1 = new java ();
  }
}
