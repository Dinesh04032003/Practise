class sample 
 {
      sample()	// constructor
	{

	   this("suraj");
	   System.out.println("constructor called");
	}

    sample(String str)
	{
	   System.out.println(str);
	}
 }


class this
 {
     public static void main(String args[])
	{
	   sample obj1=new sample();
	   //sample obj2=new sample("Suraj");

	}
 }