package pbl_app_wrapper_classes;

public class Wrapper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		System.out.printf("Given number: %d\n",n);
		System.out.println("Binary Equivalent: "+Integer.toBinaryString(n));
		System.out.println("Octal Equivalent: "+Integer.toOctalString(n));
		System.out.println("Hexadecimal Equivalent: "+Integer.toHexString(n));
	}

}