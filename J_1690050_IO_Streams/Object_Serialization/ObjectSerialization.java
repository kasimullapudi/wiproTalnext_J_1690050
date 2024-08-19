package pbl_app_IO;
import java.util.*;
import java.io.*;
class Employee implements Serializable{
		String name;
		Date dateOfBirth;
		String department;
		String designation;
		double Salary;
		Employee(String name,Date dateOfBirth,String department,String designation,double Salary){
			this.dateOfBirth=dateOfBirth;
			this.department=department;
			this.designation=designation;
			this.Salary=Salary;
			
		}
		Employee(){
			this("x",new Date(),"abc","xyz",0.00);
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public double getSalary() {
			return Salary;
		}
		public void setSalary(double salary) {
			Salary = salary;
		}
}
public class ObjectSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		Employee emp2;
		FileOutputStream fout=null;
		ObjectOutputStream obout=null;
		FileInputStream fin=null;
		ObjectInputStream obin=null;
		try {
			fout=new FileOutputStream("data.txt");
			obout=new ObjectOutputStream(fout);
			obout.writeObject(emp1);
			
			fin=new FileInputStream("data.txt");
			obin=new ObjectInputStream(fin);
			emp2=(Employee)obin.readObject();
			System.out.println(emp2.department);
		}
		catch(IOException oe) {
			System.out.println("File Error");
		}
		catch(ClassNotFoundException ce) {
			System.out.println("Class Error");
		}
		finally {
			obout.flush();
			obin.close();
			System.exit(0);
		}
		
	}

}
