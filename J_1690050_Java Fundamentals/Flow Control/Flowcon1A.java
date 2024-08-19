package pbl_app;
import java.util.*;

public class Flowcon1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n==0) {
			System.out.println("Zero");
		}
		else if(n>0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
	}

}
