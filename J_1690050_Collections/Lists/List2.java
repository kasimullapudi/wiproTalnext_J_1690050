package pbl_app_Collections;
// Type your Code here
import java.util.*;
class Employee{
	Employee(){
		
	}
	Employee(int id,String name,String email,String gen,float sal){
		this.empId=id;
		this.empName=name;
		this.email=email;
		this.gender=gen;
		this.salary=sal;
	}
	int empId;
	String empName;
	String email;
	String gender; 
	float salary;
	void GetEmployeeDetails() {
		System.out.println(String.format("Employee ID: %d\nEmployee Name: %s\nEmail: %s\nGender: %s\nSalary: %f",
				empId,empName,email,gender,salary));
	}
}
class EmployeeB{
	ArrayList<Employee> list=new ArrayList<Employee>();
	void addEmployee(Employee e) {
		list.add(e);
	}
	void deleteEmployee(int id) {
		Iterator<Employee> i=list.iterator();
		int j=0;
		int pos=0;
		Employee e=null;
		while(i.hasNext()) {
			e=i.next();
			if(e.empId==id) {
				pos=j;
			}
			j++;
		}
		list.remove(pos);
	}
	String showPaySlip(int id) {
		Iterator<Employee> i=list.iterator();
		Employee e=null;
		while(i.hasNext()) {
			e=i.next();
			if(e.empId==id) {
				return e.salary+"";
			}
		}
		return "NO DATA FOUND";
	}
}
public class List2{
    public static void main(String[] args){
        Employee eA=new Employee(1,"Sasidhar","sasidhar@sasi.ac.in","Male",50000);
        Employee eB=new Employee(2,"Gupta","gupta@sasi.ac.in","Male",60000);
        Employee eC=new Employee(3,"Gajala","gajalaCEO@sasi.ac.in","Male",100000);
        EmployeeB empB=new EmployeeB();
        empB.addEmployee(eA);
        empB.addEmployee(eB);
        empB.addEmployee(eC);
        Employee e=null;
        Iterator<Employee> i=empB.list.iterator();
        System.out.println("Before deleting,size="+empB.list.size());
        System.out.println();
        while(i.hasNext()) {
        	e=i.next();
        	System.out.println("Emp Name: "+e.empName+"  Emp Id: "+e.empId);
        }
        System.out.println();
        System.out.println("pay slip of emp with id '1': "+empB.showPaySlip(1));
        System.out.println();
        empB.deleteEmployee(0);
        System.out.println("Before deleting,size="+empB.list.size());
        Iterator<Employee> j=empB.list.iterator();
        System.out.println();
        while(j.hasNext()) {
        	System.out.println("Emp Name: "+j.next().empName);
        }
        System.out.println("pay slip of emp with id '1': "+empB.showPaySlip(1));
    }
    
}