class java1 extends Thread
{
     public  void run()
    {
      for(int i=1;i<=10;i++)
      {
          System.out.println("hello");
      } 
    }
}
class java2 extends Thread
{
  public void run()
  {
    for(int i=1;i<=10;i++)
    {
      System.out.println("hi");
    }
  }
}
class thrd
{
    public static void main(String args[])
    {
        java1 obj=new java1();
        java2 obj2=new java2();

        obj.start();
        obj2.start();
    }
}