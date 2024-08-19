package pbl_app;
import java.util.*;
public class Arrays10 {
	public static int[] merge(int[] arr1,int[] arr2) {
		int[] merged=new int[arr1.length+arr2.length];
		int j=0;
		for(int i:arr1) {
			merged[j]=i;
			j++;
		}
		for(int i:arr2) {
			merged[j]=i;
			j++;
		}
		return merged;
	}
	
	public static int[] evenOdd(int[] arr) {
		int evlen=0;
		for(int i:arr) {
			if(i%2==0) {
				evlen++;
			}
		}
		int[] even=new int[evlen];
		int[] odd=new int[arr.length-evlen];
		int i=0,j=0;
		for(int k:arr) {
			if(k%2==0) {
				even[i]=k;
				i++;
			}
			else {
				odd[j]=k;
				j++;
			}
		}
		int[] evenOdd=merge(even,odd);
	
		return evenOdd;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,3,5,2,4,0,6};
		System.out.println(Arrays.toString(evenOdd((arr))));
	}

}
