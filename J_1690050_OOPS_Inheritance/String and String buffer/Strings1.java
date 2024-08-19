package pbl_app_Oops;
import java.util.*;
public class Strings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		StringBuffer sb=new StringBuffer(in.next());
		
		String str1=sb.toString();
		String str2=sb.reverse().toString();
		
		System.out.println(str1.equals(str2) ? "Palindrome" : "Not a palindrome");
		
	}

}
