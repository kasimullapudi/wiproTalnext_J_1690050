package pbl_app_Collections;
import java.util.*;
public class List4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Number> li=new ArrayList<>();
		li.add(2);
		li.add(22.3f);
		li.add(333.22222);
		Iterator i=li.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
