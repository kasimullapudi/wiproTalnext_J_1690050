package mettl2B;

public class FindPassword_stable_unstable {
	//19m 45s
	public int findPassword(int input1,int input2,int input3,int input4,int input5) {
		// Write code here...
		// throw new UnsupportedOperationException("findPassword(int input1,int input2,int input3,int input4,int input5)");
        int[] nums={input1,input2,input3,input4,input5};
        int stab=0,unstab=0;
        for(int i:nums){
            if(isStab(i)){
                // System.out.println(i);
                stab+=i;
            }
            else{
                unstab+=i;
            }
        }
        return stab-unstab;
	}
	
	
	
    public boolean isStab(int in){
        int n=in;
        int[] num=new int[10];
        while(n!=0){
            num[n%10]++;
            n/=10;
        }
        int freq=num[in%10];
        // System.out.println(freq);
        for(int i=0;i<num.length;i++){
            if(num[i]!=freq && num[i]!=0){
                return false;
            }
        }
        return true;
    }

}
