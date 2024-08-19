package pbl_app;

import java.util.Arrays;

public class Arrays12 {
	public static int[] middleWay(int[] arr1,int[] arr2) {
		int[] newArr= {arr1[1],arr2[1]};
		return newArr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,4};
		int[] arr2= {3,5,8};
		System.out.println(Arrays.toString(middleWay(arr1,arr2)));
	}

}
