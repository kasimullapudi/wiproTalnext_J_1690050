package pbl_app_Abstraction_Packages_Exception;
import java.util.*;
class InvalidAgeException extends Exception{
	InvalidAgeException(){
		
	}
	InvalidAgeException(String str){
			super(str);
	}
}

public class Exceptions5 {
	
	public static void main(String[] args) 
			throws InvalidAgeException,ArrayIndexOutOfBoundsException,NumberFormatException {
		// TODO Auto-generated method stub
		try {
			if(!(Integer.parseInt(args[1])>=18 && Integer.parseInt(args[1])<60)) {
				throw new InvalidAgeException("Please Enter age between 18 and 60");
			}
			System.out.println("Details entered succesfully!!");
		}
		catch(InvalidAgeException ie) {
			System.out.println(ie.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Please Enter atleast 2 arguments");
		}
		catch(NumberFormatException ne) {
			System.out.println("Please Enter an Integer for second Argument");
		}
		
		
	}

}
