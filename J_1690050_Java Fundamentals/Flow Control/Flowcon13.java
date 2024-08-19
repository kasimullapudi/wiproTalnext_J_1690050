package pbl_app;
import java.util.*;
public class Flowcon13 {
	public static boolean isPrime(int n) {
		boolean res=false;
		
		if(n==2) {
			res=true;
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					res=false;
					break;
				}
				else {
					res=true;
				}
			}
		}
		return res;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=10;i<100;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
	}

}
