package pbl_app_Collections;
import java.util.*;
public class Sets2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h1=new HashSet<>();
		String[] s= {"Joe","Biden","Trumph","Donald","Kim"};
		h1.addAll(Arrays.asList(s));
		Iterator i=h1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
