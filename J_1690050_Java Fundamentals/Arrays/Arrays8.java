package pbl_app;
import java.util.*;

public class Arrays8 {
	public static int in(int[] arr,int val) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,3,6,1,2,7,9};
		int index6=in(arr,6);
		int index7=in(arr,7);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(i>=index6 && i<=index7) {
				continue;
			}
			sum+=arr[i];
		}
		
		System.out.println(sum);
	}

}
