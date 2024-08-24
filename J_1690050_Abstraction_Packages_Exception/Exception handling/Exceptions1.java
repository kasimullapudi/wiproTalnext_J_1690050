package pbl_app_Abstraction_Packages_Exception;
import java.util.*;
public class Exceptions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[] arr;
		System.out.println("Enter the number of elememts: ");
		arr=new int[in.nextInt()];
		int index;
		System.out.println("Enter elements in array: ");
		try {
			for(int i=0;i<arr.length;i++) {
				arr[i]=in.nextInt();
			}
			System.out.print("enter index u want: ");
			index=in.nextInt();
			System.out.println(arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException ie) {
			System.out.printf("please enter index betweeen 0 and %d",arr.length-1);
		}
		catch(NumberFormatException | InputMismatchException ne) {
			System.out.printf("Please enter an Integer");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}