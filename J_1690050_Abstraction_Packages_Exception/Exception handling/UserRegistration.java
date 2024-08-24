package pbl_app_Abstraction_Packages_Exception;
import java.util.*;
class InvalidCountryException extends Exception{
	InvalidCountryException(){
		
	}
	InvalidCountryException(String msg){
		super(msg);
	}
}

public class UserRegistration{
	static void registerUser(String userName,String userCountry) throws InvalidCountryException{
		if(!userCountry.equals("India")) {
			throw new InvalidCountryException("User outside india cannot be registered!");
		}
		else {
			System.out.println("User Registered Succesfully!!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter user name: ");
		String name=new String(in.next());
		System.out.print("Enter user country: ");
		String country=new String(in.next());
		try {
			registerUser(name,country);
		}
		catch(InvalidCountryException ie) {
			System.out.println(ie.getMessage());
		}
	}

}
