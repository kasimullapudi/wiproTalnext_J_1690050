package mettl2A;

public class MostFrequentlyOccurringDigit {
	//7m51s
	public static int mostFrequentlyOccurringDigit(int[] input1,int input2) {
		// Write code here...
		// throw new UnsupportedOperationException("mostFrequentlyOccurringDigit(int[] input1,int input2)");
        int[] num=new int[10];
        String s="";
        for(int i:input1){
            s+=i;
        }
        for(char i:s.toCharArray()){
            num[con(i)]++;
        }
        int max=0,maxI=0;
        for(int i=0;i<num.length;i++){
            if(num[i]>=max){
                max=num[i];
                maxI=i;
            }
        }
        return maxI;
	}

	public static int con(char s){
	    return Integer.parseInt(""+s);
	}
}
