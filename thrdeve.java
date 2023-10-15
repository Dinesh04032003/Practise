class java1 extends Thread
{
     public  void run()
    {
      for(int i=1;i<=20;i++)
      {
        if(i%2==0)
        {
          System.out.println(i+"is a even number");
        }  
          try{
          Thread.sleep(1000);
             } catch(Exception s){} 
      }
      
    }
}
class java2 extends Thread
{
  public void run()
  {
    for(int i=1;i<=20;i++)
    {
        if(i%2!=0)
        {
          System.out.println(i+"is a odd number");
        }  
       try{
          Thread.sleep(1000);
           } catch(Exception s){} 
    }
  }
}
class thrdeve
{
    public static void main(String args[])
    {
        java1 obj=new java1();
        java2 obj2=new java2();

        obj2.start();
        try{
          Thread.sleep(1000);
           } catch(Exception s){} 
        obj.start();
    }
}