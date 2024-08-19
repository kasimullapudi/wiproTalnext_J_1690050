package pbl_app_wrapper_classes;
import java.util.*;
public class Wrapper3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter integer: ");
		int n=in.nextInt();
		String b=String.format("%8s",Integer.toBinaryString(n));
		System.out.println(b.replace(' ', '0'));
	}

}
