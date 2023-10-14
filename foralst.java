import java.util.*;

class java1
{
    java1()
    {
       ArrayList <Integer> din=new ArrayList<Integer>();
       din.add(10);
       din.add(30);
       din.add(40);
       for(int i:din)
       {
        System.out.println(i);
       } 
    }

}
class foralst
{
    public static void main(String args[])
    {
        java1 obj=new java1();
    }
}