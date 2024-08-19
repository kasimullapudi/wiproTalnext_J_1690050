package pbl_app_Oops;
import java.util.*;

public class Strings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		StringBuffer s1 = new StringBuffer(in.next());
		StringBuffer s2 = new StringBuffer(in.next());
		
		if(s1.toString().charAt(s1.length()-1)==s2.toString().charAt(0)) {
			s2.delete(0, 1);
		}
		System.out.println(s1.append(s2).toString().toLowerCase());
	}

}
