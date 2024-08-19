package pbl_app_Oops;
class Shape{
	void draw() {
		System.out.println("Drawing Shape....");
	}
	void erase() {
		System.out.println("Erasing Shape....");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle....");
	}
	void erase() {
		System.out.println("Erasing Circle....");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("Drawing Triangle ....");
	}
	void erase() {
		System.out.println("Erasing Triangle....");
	}
}

class Square extends Shape{
	void draw() {
		System.out.println("Drawing Square....");
	}
	void erase() {
		System.out.println("Erasing Sqaure....");
	}
}

public class Override2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape=new Shape();
		Shape circle=new Circle();
		Shape triangle = new Triangle();
		Shape square = new Square();
		shape.draw();
		circle.draw();
		triangle.draw();
		square.draw();
		
	}

}
