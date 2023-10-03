import java.util.*;
class Sum 
{
    Sum()
    {
        Scanner din=new Scanner(System.in);
        int a=din.nextInt();
        int b=0;
        int i=2;
        while(i<a)
        {
           if(a%i==0)
           {
              b=b+1; 
           }
           i=i+1;
        }
        if(b==0)
        {
            System.out.println(a+"is a prime number");
        }
        else
        {
            System.out.println(a+"is a  not prime number");
        }
    }
}
class primenumb
{
    public static void main (String[] args) 
    {
        Sum obj=new Sum();
    }
    
}
