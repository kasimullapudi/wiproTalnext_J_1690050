package pbl_app;
import java.util.*;

public class Flowcon4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		char a1=in.next().charAt(0);
		char a2=in.next().charAt(0);
		System.out.println(a1>=a2 ? a2+","+a1 : a1+","+a2);
	}

}
