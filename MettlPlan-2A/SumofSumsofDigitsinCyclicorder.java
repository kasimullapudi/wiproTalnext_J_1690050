package mettl2A;

public class SumofSumsofDigitsinCyclicorder {
	//4m 51s
	public int sumOfSumsOfDigits(int input1) {
		// Write code here...
		// throw new UnsupportedOperationException("sumOfSumsOfDigits(int input1)");
        String s=""+input1;
        int sum=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                sum+=con(s.charAt(j));
            }
        }
        return sum;

	}
    public int con(char c){
        return Integer.parseInt(""+c);
    }
}
