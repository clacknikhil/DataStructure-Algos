package arrayPractice;

public class Bike {
	void run() {
		System.out.println("running");
	}
}

class Splendor extends Bike {
        void run() {
		System.out.println("running safely with 60km");
	}

	public static void main(String args[]) {
		Bike b = new Splendor();// upcasting
		b.run();
		Bike a = new Bike();
		a.run();
		//Splendor c = new Bike();
		Splendor d = new Splendor();
		d.run();
	}
}