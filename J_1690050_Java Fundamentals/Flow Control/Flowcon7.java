package pbl_app;
import java.util.*;

public class Flowcon7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		char a=in.next().charAt(0);
		char b;
		if(a>=65 && a<=90) {
			System.out.println(a+"->"+(char)(a+32));
		}
		else if(a>=97 && a<=122) {
			System.out.println(a+"->"+(char)(a-32));
		}
		
	}

}
