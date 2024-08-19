package pbl_app_Oops;
import java.util.*;
public class Strings6 {
	public static String sLs(String a,String b) {
		if(a.length()>b.length()) {
			return(b+a+b);
		}
		else {
			return(a+b+a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		String a= new String(in.next());
		String b= new String(in.next());
		System.out.println(sLs(a,b));
	}

}
