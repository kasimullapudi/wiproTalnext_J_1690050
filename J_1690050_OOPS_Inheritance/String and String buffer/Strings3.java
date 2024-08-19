package pbl_app_Oops;
import java.util.*;
public class Strings3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		StringBuffer sb = new StringBuffer(in.next());
		String s="";
		int i=sb.length()-1;
		while(i>=0) {
			s+=sb.substring(0,2);
			i--;
		}
		System.out.println(s);
	}

}
