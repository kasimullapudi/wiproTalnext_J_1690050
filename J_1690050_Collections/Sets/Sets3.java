package pbl_app_Collections;

import java.util.*;

public class Sets3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> h1=new TreeSet<>();
		TreeSet<String> h2=new TreeSet<>();
		String[] s= {"Joe","Biden","Trump","Donald","Kim"};
		h1.addAll(Arrays.asList(s));
		ArrayList<String> a=new ArrayList<>(h1);
		ListIterator<String> i=a.listIterator(a.size());
		while(i.hasPrevious()) {
			String l=i.previous();
			h2.add(l);
//			System.out.println(l);
		}
		Iterator j=h1.iterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		System.out.println("----------------------------------");
		j=h2.iterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
	}

}
