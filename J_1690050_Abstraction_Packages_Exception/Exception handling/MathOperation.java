package pbl_app_Abstraction_Packages_Exception;
import java.util.*;
public class MathOperation {

	public static void main(String[] args) throws ArithmeticException,NumberFormatException,InputMismatchException {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		int sum=0;
		double avg;
		try {
			for(int i=0;i<5;i++){
			arr[i]=Integer.parseInt(args[i]);
			sum+=arr[i];
			}
			avg=sum/5;
			System.out.printf("sum is :%d\n",sum);
			System.out.printf("avg is :%.2f",avg);
		}
		catch(InputMismatchException | NumberFormatException ie) {
			System.out.println("Please Enter an integer");
		}
		
	}

}