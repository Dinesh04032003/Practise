import java.lang.*;

class java1
{
    java1()
    {
      int a=10;
      int b=20;
      System.out.println("The addition of two numbers is "+ Math.addExact(a,b));
}
}
class java2
{
    java2()
    {
        int s=2;
        int r=4;
        double t= Math.pow(s,r);
        long h=Math.round(t);
        System.out.println("The power of two numbers is"+h);
    }
}
class mathvar
{
    public static void main(String args[])
    {
        java1 obj=new java1();
        java2 obj1=new java2();
    }
}