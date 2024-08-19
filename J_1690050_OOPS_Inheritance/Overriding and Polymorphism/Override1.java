package pbl_app_Oops;
class Fruit{
	String name,taste;
	int size;
	public Fruit() { }
	public Fruit(String name,String taste) {
		this.name=name;
		this.taste=taste;
	}
	public void eat() {
		System.out.printf("%s taste is %s\n",this.name,this.taste);
	}
}
class Apple extends Fruit{
	public void eat() {
		System.out.println("Apple taste is sweet");
	}
}
class Orange extends Fruit{
	public void eat() {
		System.out.println("Orange taste is sour");
	}
}
public class Override1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit mango=new Fruit("Mango","Bloody Sweet");
		Fruit orange=new Orange();
		Fruit apple=new Apple();
		mango.eat();
		orange.eat();
		apple.eat();
		
	}

}
