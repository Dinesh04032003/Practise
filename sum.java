class num 
{
    num()
    {
        int a=10;
        int b=0;
        int i=1;
        while(i<=a)
        {
            b=b+i;
            i+=1;
        }
    System.out.println("The sum of 1st 10 numbers is= "+b);
    }
}
class sum
{
    public static void main (String[] args) 
    {
        num obj=new num();
    }
    
}