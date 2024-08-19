package pbl_app_Oops;
import java.util.*;

class Calculator{
    
    public static int powerInt( int num1, int num2){
        return (int)Math.pow(num1,num2);
    }
    public static double powerDouble(double num1,double num2){
        return Math.pow(num1,num2);
    }
    
}

public class Classes2
{
	public static void main(String[] args) {
		
		System.out.println("powers of ints: "+Calculator.powerInt(2,2));
		System.out.println("powers of double: "+Calculator.powerDouble(2.5,2));
		
	}
}
