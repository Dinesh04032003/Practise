class sup
{
    sup(){
       System.out.println("dinesh");      
}
void display(int a,int b){
       System.out.println(a*b);
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
class tryin
{
public static void main(String []args){
sys c1=new sys();
}
}