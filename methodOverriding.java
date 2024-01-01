package cse225g1;
class Vehicle{
	 public void drive() {
		System.out.println("Driving a Car");
	}
}
class Car extends Vehicle{
	public void drive() {
		System.out.println("Repairing a car");
	}
	
}
public class prob4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.drive();
	}

}
