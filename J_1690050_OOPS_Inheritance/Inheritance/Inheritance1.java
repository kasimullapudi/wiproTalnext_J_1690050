package pbl_app_Oops;

class Animal{
	public void eat() {
		System.out.println("Animal is Eating");
	}
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
}
class Bird extends Animal{
	public void eat() {
		System.out.println("Bird is eating");
	}
	public void sleep() {
		System.out.println("Bird is Sleeping");
	}
	public void fly() {
		System.out.println("Bird is flying");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Animal();
		Bird bird=new Bird();
		animal.eat();
		bird.eat();
		animal.sleep();
		bird.sleep();
		bird.fly();
	}

}
