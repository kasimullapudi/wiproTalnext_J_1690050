package pbl_app;

public class Arrays11 {
	public static boolean only14(int[] arr){
		int a=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1 || arr[i]==4) {
				a++;
			}
		}
		return a==arr.length ? true : false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,2,4};
		System.out.println(only14(arr));
	}

}
