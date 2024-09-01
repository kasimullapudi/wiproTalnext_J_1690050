package mettl2A;

public class SimpleEncodedArray {
	//6m
	public Result findOriginalFirstAndSum(int[] input1,int input2) {
		//Write code here...
	    // throw new UnsupportedOperationException("findOriginalFirstAndSum(int[] input1,int input2)");
	    for(int i=input2-2;i>=0;i--){
	        input1[i]=input1[i]-input1[i+1];
	    }
	    int sum=0;
	    for(int j:input1){
	        sum+=j;
	    }
	    // System.out.println(Arrays.toString(input1));
	    return new Result(input1[0],sum);
	}
}
