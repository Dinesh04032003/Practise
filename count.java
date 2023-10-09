import java.util.*;
class java 
{
    java()
    {
       Scanner din=new Scanner(System.in);
       int a=din.nextInt();
       int b=0;
       int r=0;
        for(int i=0;i<4;i++)
        {
            r=a%10;
            b=b+1;
            a=a/10;
        }
        System.out.println("The count is "+b);
    }
}
class count
{
public static void main (String[] args) 
{
    java c1=new java();
}
}