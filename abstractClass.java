package cse225g1;

abstract class Animals{
	abstract void cats();
	abstract void dogs();
	
}
class Cats extends Animals{
	public void cats() {
		System.out.println("Cats meow");
	}
	
}
class Dogs extends Animals{
	public void dogs() {
		System.out.println("Dogs bark");
	}
}

public class internal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cats obj1=new Cats();
		Dogs obj2=new Dogs();
		obj1.cats();
		obj2.dogs();

	}

}
