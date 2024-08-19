package pbl_app_Oops;
import java.util.*;
public class Strings7 {
	public static String removeX(StringBuffer s) {
		if(s.charAt(0)=='x' && s.charAt(s.length()-1)=='x') {
			return s.substring(1,s.length()-1);
		}
		return s.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		StringBuffer s= new StringBuffer(in.next());
		
		System.out.println(removeX(s));
		
		
	}

}
