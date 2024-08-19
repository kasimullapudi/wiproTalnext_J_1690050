package pbl_app;
import java.util.*;
public class Arrays5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {58,43,52,11,55,90,38,99};
		
		Arrays.sort(arr);
		int max1=arr[arr.length-1],
				max2=arr[arr.length-2],
				min1=arr[0],
				min2=arr[1];
		System.out.println("Max1: "+max1+"\tMax2: "+max2+"\n"+"Min1: "+min1+"\tMin2: "+min2);
		
	}

}
