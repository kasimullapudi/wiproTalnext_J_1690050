package pbl_app;
import java.util.*;
public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[] arr= {2,4,12,5,6,3,1,7,9};
		int index=-1;
		int num=in.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				index=i;
				break;
			}
			
		}
		System.out.println(index);
	}

}
