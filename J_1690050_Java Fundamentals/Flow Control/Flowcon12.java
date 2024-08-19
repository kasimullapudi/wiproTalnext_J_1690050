package pbl_app;
import java.util.*;
public class Flowcon12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String res="Not a Prime";
		
		if(n==2) {
			res="Prime";
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					res="Not a Prime";
					break;
				}
				else {
					res="Prime";
				}
			}
		}
		System.out.println(res);
		
		
	}

}
