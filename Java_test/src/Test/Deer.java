package Test;

public class Deer extends Animal {
	@Override
	public void eat() {
		System.out.println("Deer is eating...");
	};

	@Override
	public void sleep() {
		System.out.println("Deer is sleeping...");
	};
}
