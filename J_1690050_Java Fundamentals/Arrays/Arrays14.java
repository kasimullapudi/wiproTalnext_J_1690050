package pbl_app;

import java.util.Arrays;

public class Arrays14 {
	public static int max(int[] arr) {
		int max=arr[0];
		for(int i:arr) {
			if(i>max) {
				max=i;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[3][3];
		int[] newArr=new int[9];
		int j=0;
		if(args.length!=9) {
			System.out.println("Please Enter 9 integer numbers");
		}else {
			System.out.println("The given array is: ");
			for(int i=0;i<3;i++) {
				for(int k=0;k<3;k++) {
					arr[i][k]=Integer.parseInt(args[j]);
					newArr[j]=Integer.parseInt(args[j]);
					j++;
				}
				System.out.println(Arrays.toString(arr[i]));
			}
			System.out.println(String.format("The biggest number in 3x3 array is: %d",max(newArr)));
		}
	}

}
