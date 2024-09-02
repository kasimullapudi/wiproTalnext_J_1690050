package mettl2B;

public class Findresultafteralternateadd_subonN {
	//22m
	public int AddSub(int input1,int input2) {
		// Write code here...
		// throw new UnsupportedOperationException("AddSub(int input1,int input2)");
        int res=input1;
        int val=input1;
        if(input2==1){
            int i=1;
            while(val!=1){
                val=input1-i;
                
                if(i%2==1)res+= -val;
                if(i%2==0)res+=(val);
                if(val==1)break;
                i++;
            }
        }
        else{
            int i=1;
            while(val!=1){
                val=input1-i;
                if(i%2==1) res+= (val);
                if(i%2==0) res+= -(val);
                if(val==1) break;
                i++;
            }
        }
        return res;
	}
}

