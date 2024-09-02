package mettl2B;

public class GenerateseriesandfindNthelement {
	//13m
	public static int seriesN(int input1,int input2,int input3,int input4) {
		// Write code here...
		// throw new UnsupportedOperationException("seriesN(int input1,int input2,int input3,int input4)");
        int gap1,gap2;
        gap1=input2-input1;
        gap2=input3-input2;
        int n=input3;
        for(int i=4;i<=input4;i++){
            if(i%2==0) n+=gap1;
            if(i%2==1) n+=gap2;
        }
        return n;
}
		


}
