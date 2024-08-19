package pbl_app;
import java.util.*;
public class Flowcon14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int sum=0;
		while(n!=0) {
			sum+=n%10;
			n=n/10;
		}
		System.out.println(sum);
	}

}
