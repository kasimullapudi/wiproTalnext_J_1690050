package pbl_app_wrapper_classes;
class Employee implements Cloneable{
	String name;
	int age;
	Employee cloneObj() {
		try {
			return (Employee)super.clone();
		}
		catch(CloneNotSupportedException ce) {
			System.out.println("Clone not supported");
			return this;
		}
	}
}
public class Wrapper4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		Employee emp2;
		emp1.name="Gupta";
		emp1.age=32;
		emp2=emp1.cloneObj();
		System.out.println(emp1.name+" "+emp1.age);
		System.out.println(emp2.name+" "+emp2.age);
		emp1.name="Reddy";
		emp1.age=20;
		System.out.println(emp1.name+" "+emp1.age);
		System.out.println(emp2.name+" "+emp2.age);
	}

}
