class material{
int bat,ball,stumps;
material(int bat,int ball,int stamp){
 this.bat=bat;
 this.ball=ball;
 this.stumps=stumps;
}
}
class cricket{
int x;
material add;
cricket(int x,material add){
this.x=x;
this.add=add;
}
void display(){
System.out.println("Circket team");
System.out.println("The number of players in the criket team is "+x);
System.out.println("The materials available for the team are");
System.out.println("No of bats="+add.bat);
System.out.println("No of balls="+add.ball);
System.out.println("No of stumps="+add.stumps);
}
}
class entity{
public static void main(String args[]){
material c1=new material(10,20,30);
cricket c2=new cricket(11,c1);
c2.display();
}
}