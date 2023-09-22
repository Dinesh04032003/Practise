class Car {

	String brand;
	
	//your constructor here
	
	public String getBrand() {
		return brand;
	}

	void run() {
		System.out.println("Car is running...");
	}
}

public class Sample1 {
	
	public static void main(String[] args) {
		Car ford = new Car();	
		ford.run()
	}
}
