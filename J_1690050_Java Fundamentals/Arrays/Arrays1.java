package pbl_app;
public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,34,43,2,53,65,21};
		int sum=0;
		int avg;
		for(int i:arr) {
			sum+=i;
		}
		avg=sum/arr.length;
		System.out.println("Sum "+sum+"\n"+"Average "+avg);
	}

}
