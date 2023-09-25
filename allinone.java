abstract class trs{
    abstract void getdata(int x,int y);
}
class sup extends trs
{
    void getdata(int x,int y){
        System.out.println("the sub is "+(x-y));
    }
    sup(){
       System.out.println("dinesh");
       this.display("suaraj");      
}
void display(int a,int b){
       System.out.println(a*b);
}
void display(String str){
       System.out.println(str);
}
}
class sys extends sup
{
     sys(){
       super.display(10,20);
       System.out.println("mohan");
       this.display(8,7);
}
void display(int a,int b){
      System.out.println(a*b);
}
}
class allinone
{
public static void main(String []args){
sys c1=new sys();
c1.getdata(20,10);
}
}
