package pbl_app_Oops;
import java.util.*;
public class Strings10 {
	public static String last3(StringBuffer s,int n) {
		String s1="";
		String s2=s.substring(s.length()-n,s.length());
		while(n!=0) {
			s1+=s2;
			n--;
		}
		return s1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		StringBuffer s= new StringBuffer("Wipro");
		int n=3; //in.nextInt();
		System.out.println(last3(s,n));
	}

}
