package pbl_app_Oops;
class TestEmployee extends Employee{
	public TestEmployee() {
		
	}
	public TestEmployee(String name,double salary,int year,String number) {
		super(name,salary,year,number);
	}
}
public class Inheritance2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEmployee test=new TestEmployee("Tony",99.8,2022,"2389AVM1002");
		test.getEmployeeDetails();
	}

}
