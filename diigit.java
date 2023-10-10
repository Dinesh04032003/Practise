import java.util.*;
class java
{
    java()
    {
    System.out.println("Program to check digit or not in Java");
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter a input");
    char ch = sc.next ().charAt (0);
     if(ch>='0' && ch<='9')
	 {
	  	System.out.println("Given Input is Digit.");
	 }
	 else
	 {
	  	System.out.println("Given Input is Not Digit.");
	 }
    }
}
class digit
{
    public static void main(String arg[])
    {
        java sc=new java();
    }
}