package arrayPractice;

public class Animal {

	public void sound() {
		System.out.println("Animal is making sound");

	}

}

class Horse extends Animal{
	
	public void sound() {
		
		System.out.println("Neigh");
	}

	public static void main(String [] args) {
		
		Animal obj = new Horse();
		obj.sound();
	}
	
}