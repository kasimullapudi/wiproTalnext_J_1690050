package pbl_app;

import java.util.Arrays;

public class Arrays9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,10,3,2,10,9};
		int[] arrNew=new int[arr.length];
		int j=0;
		for(int i:arr) {
			if(i!=10) {
				arrNew[j]=i;
				j++;
			}
		}
		System.out.println(Arrays.toString(arrNew));
	}

}
