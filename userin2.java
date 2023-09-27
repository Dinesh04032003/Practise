import java.io.*;
class rect
{
    DataInputStream rin=new DataInputStream(System.in);
    rect()
    {
        try{
            System.out.println("enter the l value");
            int l=Integer.parseInt(rin.readLine());
            System.out.println("enter the b value");
            int b=Integer.parseInt(rin.readLine());
            System.out.println("The area of rectanglr is= "+(l*b));
        }catch(Exception c){}
    }
}
class tri
{
    DataInputStream din=new DataInputStream(System.in);
    tri()
    {
        try{
            System.out.println("enter the height value");
            int h=Integer.parseInt(din.readLine());
            System.out.println("enter the  base value");
            int b1=Integer.parseInt(din.readLine());
            System.out.println("the area of triangel is= "+(0.5*h*b1));
        }catch(Exception p){}
    }
}
class userin2
{
    public static void main(String args[])
    {
        rect obj=new rect();
        tri obj1=new tri();
    }
}
             