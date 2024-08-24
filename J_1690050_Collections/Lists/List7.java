package pbl_app_Collections;
import java.util.*;
import pbl_app_Collections.Employee;
public class List7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> li=new Vector<>();
		Employee eA=new Employee(1,"Sasidhar","sasidhar@sasi.ac.in","Male",50000);
        Employee eB=new Employee(2,"Gupta","gupta@sasi.ac.in","Male",60000);
        Employee eC=new Employee(3,"Gajala","gajalaCEO@sasi.ac.in","Male",100000);
        li.add(eA);
        li.add(eB);
        li.add(eC);
        Iterator<Employee> i=li.iterator();
        while(i.hasNext()) {
        	i.next().GetEmployeeDetails();
        	System.out.println();
        }
	}

}
