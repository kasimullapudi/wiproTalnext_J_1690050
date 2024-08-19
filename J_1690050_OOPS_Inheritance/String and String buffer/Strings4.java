package pbl_app_Oops;
import java.util.*;

public class Strings4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		StringBuffer sb=new StringBuffer(in.next());
		if(sb.length()%2==0) {
			System.out.println(sb.substring(0,sb.length()/2));
		}
		else {
			System.out.println("null");
		}
	}

}
