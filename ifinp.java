import java.util.*;

class java1
{
    Scanner din =new Scanner(System.in);
    int a=din.nextInt();
    int b=din.nextInt();
    int c=din.nextInt();
    java1()
    {
      if((a>b) && (a<c))
      {
        System.out.println("a is greater");
      }
      else if((b>a)&&(b>c))
      {
        System.out.println("b is greater");
      }
      else
      {
        System.out.println("c is greater");
      }
    }
}
class ifinp
{
    public static void main(String args[])
    {
        java1 obj=new java1();
    }
}