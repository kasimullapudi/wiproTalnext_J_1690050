package pbl_app_Collections;

import java.util.*;

public class List5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=new LinkedList<>();
		String mon="January February March April May June July August September October November December";
		String[] months=mon.split("\\s+");
		for(String i: months) {
			li.add(i);
		}
//		System.out.println(li);
		Iterator i=li.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
