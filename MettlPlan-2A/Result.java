package mettl2A;

public class Result {
	public int output1;
	public int output2;
	
	public final String out1;
	public final String out2;
	public final String out3;
	
	Result(int output1,int output2){
		this.output1=output1;
		this.output2=output2;
		this.out1 = "";
		this.out2 = "";
		this.out3 = "";
	}
	Result(String out1,String out2,String out3){
		this.out1=out1;
		this.out2=out2;
		this.out3=out3;
	}
}
