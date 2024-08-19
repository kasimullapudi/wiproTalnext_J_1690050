package pbl_app;

import java.util.Arrays;

public class Arrays7 {
	public static boolean in(int[] arr,int val) {
		for(int i=0;i<arr.length;i++) {
			if(val==arr[i]) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,2,8,6,9,1};
		int[] arrNew=new int[arr.length];
		int j=0;
		for(int i:arr) {
			if(in(arrNew,i)) {
				continue;
			}
			else {
				arrNew[j]=i;
				j++;
			}
		}
		arr=new int[j];
		for(int i=0;i<j;i++) {
			arr[i]=arrNew[i];
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
