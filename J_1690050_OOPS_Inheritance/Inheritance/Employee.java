package pbl_app_Oops;

public class Employee extends Person{
	double salary;
	int yearOfWork;
	String insuranceNumber;
	public Employee() {
		
	}
	public Employee(String name,double sal,int year,String insurance) {
		super.setName(name);
		this.salary=sal;
		this.yearOfWork=year;
		this.insuranceNumber=insurance;
	}
	public void setName(String name) {
		super.setName(name);
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public void setYearOfWork(int year) {
		this.yearOfWork=year;
	}
	public void setInsuranceNumber(String number) {
		this.insuranceNumber=number;
	}
	public String getName() {
		System.out.println("Name: "+this.name);
		return this.name;
	}
	public double getSalary() {
		System.out.println("Salary: "+this.salary);
		return this.salary;
	}
	public int getYearOfWork() {
		System.out.println("Year Of work Started: "+this.yearOfWork);
		return this.yearOfWork;
	}
	public String getInsuranceNumber() {
		System.out.println("National Insurance Number: "+this.insuranceNumber);
		return this.insuranceNumber;
	}
	public void getEmployeeDetails() {
		this.getName();
		this.getSalary();
		this.getYearOfWork();
		this.getInsuranceNumber();
	}
	
	
	
}
