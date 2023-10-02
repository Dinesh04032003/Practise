class Sum 
{
    Sum()
    {
        int a=10;
        int i=1;
        System.out.println(a+" table");
        while(i<=a)
        {
            System.out.println(a+"x"+i+"="+(a*i));
            i+=1;
        }
    }
}
class table
{
    public static void main (String[] args) 
    {
        Sum obj=new Sum();
    }
    
}
