package pbl_app;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {23,54,50,11,42,21,99,34};
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Max "+max+"\n"+"Min "+min);
		
	}

}
