class java 
{
    java()
    {
      StringBuilder sb=new StringBuilder();    
      System.out.println(sb.capacity());
      sb.append("Hello");    
      System.out.println(sb.capacity());  
      sb.append("Java is my favourite language");    
      System.out.println(sb.capacity());
    }
}
class capacity
{
public static void main (String[] args) 
{
    java c1=new java();
}
}