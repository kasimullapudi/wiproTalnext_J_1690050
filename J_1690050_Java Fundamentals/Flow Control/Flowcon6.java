package pbl_app;

public class Flowcon6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[1]);
		switch(args[0]) {
		case "Female":
			if(n>=1 && n<=58) {
				System.out.println("the percentage of interest is 8.2%");
			}
			else if(n>=59 && n<=100) {
				System.out.println("the percentage of interest is 9.2%");
			}
			break;
		case "Male":
			if(n>=1 && n<=58) {
				System.out.println("the percentage of interest is 8.4%");
			}
			else if(n>=59 && n<=100) {
				System.out.println("the percentage of interest is 10.5%");
			}
			break;
		}
	}

}
