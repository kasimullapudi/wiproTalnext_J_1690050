package pbl_app_Oops;
import java.util.*;
public class Strings8 {
	public static String removebefaf(StringBuffer s) {
		int star=s.indexOf("*");
		s.delete(star-1,star+2);
		return s.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		StringBuffer s=new StringBuffer(in.next());
		System.out.println(removebefaf(s));
	}

}
