package pbl_app_Oops;
import java.util.*;
public class Strings9 {
	public static String altchar(StringBuffer s1,StringBuffer s2) {
		String s="";
		
		int max=Math.max(s1.length(), s2.length());
		for(int i=0,j=0;i<max;i++,j++) {
			if(i<s1.length() && j<s2.length()) {
				s=s+s1.charAt(i)+s2.charAt(j);
			}
			else if(i<s1.length()) {
				s=s+s1.charAt(i);
			}
			else if(j<s2.length()) {
				s=s+s2.charAt(j);
			}
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		StringBuffer s1=new StringBuffer(in.next());
		StringBuffer s2=new StringBuffer(in.next());
		
		System.out.println(altchar(s1,s2));
		
		
	}

}
