package pbl_app;
import java.util.*;

public class Flowcon5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		char a=in.next().charAt(0);
		if(Character.isAlphabetic(a)) {
			System.out.println("Alphabet");
		}
		else if(Character.isDigit(a)) {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}
	}

}
