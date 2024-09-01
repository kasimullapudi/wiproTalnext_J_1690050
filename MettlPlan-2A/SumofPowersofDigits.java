package mettl2A;

public class SumofPowersofDigits {
	//6m
	public int sumOfPowerOfDigits(int input1){
		// Write code here...
		// throw new UnsupportedOperationException("sumOfPowerOfDigits(int input1)");
         String s=""+input1;
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0')continue;
            sum+=Math.pow(con(s.charAt(i)),con(s.charAt(i+1)));
        }
        return sum+1;
	}
	
    public int con(char c){
        return Integer.parseInt(""+c);
    }
}


