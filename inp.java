package login;
import java.io.*;
public class inp
{
    DataInputStream din=new DataInputStream(System.in); 
    public inp()
    {
        try{
        String x=din.readLine();
        String y=din.readLine();
        int z=Integer.parseInt(din.readLine()); 
        String e=din.readLine();
        System.out.println("Tekfilo Innovation");
        System.out.println("1st Name: "+x);
        System.out.println("2nd Name: "+y);
        System.out.println("Password: "+z);
        System.out.println("Email:    "+e);
        System.out.println("Login sucessful");
        }catch(Exception s){}
    }
}