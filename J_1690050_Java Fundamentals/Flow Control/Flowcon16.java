package pbl_app;
import java.util.*;
public class Flowcon16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s="";
		while(n!=0) {
			s+=n%10;
			n/=10;	
		}
		System.out.println(Integer.parseInt(s));
	}

}
