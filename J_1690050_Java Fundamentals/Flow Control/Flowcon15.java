package pbl_app;

public class Flowcon15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		for(int i=0;i<n;i++) {
			int j=0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
		}
	}

}
