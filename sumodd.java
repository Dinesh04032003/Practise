import java.util.*;
class Sum 
{
    Sum()
    {
        Scanner din=new Scanner(System.in);
        int a=din.nextInt();
        int b=0;
        int c=0;
        int i=1;
        while(i<=a)
        {
           if(i%2==0)
           {
              b=b+i; 
           }
           else 
           {
             c=c+i;  
           }
           i=i+1;
        }
    System.out.println("The sum of even is"+b);
    System.out.println("The sum of odd is"+c);
    }
}
class sumodd
{
    public static void main (String[] args) 
    {
        Sum obj=new Sum();
    }
    
}
