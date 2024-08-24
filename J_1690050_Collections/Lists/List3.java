package pbl_app_Collections;
import java.util.*;
public class List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=new ArrayList<String>();
		li.add("hello");
		li.add("hi");
		li.add("bye");
		Iterator i=li.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
