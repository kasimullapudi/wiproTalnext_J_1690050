package pbl_app;

import java.util.Scanner;

public class Flowcon17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int n=a;
		String s="";
		while(n!=0) {
			s+=n%10;
			n/=10;	
		}
		int b=Integer.parseInt(s);
		System.out.println(b==a ? "Palindrome" : "Not a Palindrome");
	}

}
