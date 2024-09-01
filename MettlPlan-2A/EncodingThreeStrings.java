package mettl2A;

public class EncodingThreeStrings {
	//28m 52s
	public Result encodeThreeStrings(String input1,String input2,String input3) {
		//Write code here...
        // throw new UnsupportedOperationException("encodeThreeStrings(String input1,String input2,String input3)");
        String[][] strs=new String[3][3];
        String[] ips={input1,input2, input3};
        StringBuilder s;
        int len;
        for(int i=0;i<3;i++){
            s=new StringBuilder(ips[i]);
            len=ips[i].length();
            if(len%3==0){
               strs[i][0]=s.substring(0,len/3);
               strs[i][1]=s.substring(len/3,len/3*2);
               strs[i][2]=s.substring(len/3*2,len);
           } 
           if(len%3==1){
               strs[i][0]=s.substring(0,len/3);
               strs[i][1]=s.substring(len/3,len/3*2+1);
               strs[i][2]=s.substring(len/3*2+1,len);
           }
           if(len%3==2){
               strs[i][0]=s.substring(0,len/3+1);
               strs[i][1]=s.substring(len/3+1,(len/3*2)+1);
               strs[i][2]=s.substring(len/3*2+1,len);
           }
        }
        // System.out.println(Arrays.toString(strs[0]));
        // System.out.println(Arrays.toString(strs[1]));
        // System.out.println(Arrays.toString(strs[2]));

        String out1=strs[0][0]+strs[1][0]+strs[2][0];
        String out2=strs[0][1]+strs[1][1]+strs[2][1];
        String out3=strs[0][2]+strs[1][2]+strs[2][2];
        
        return new Result(out1,out2,toggle(out3));
    }
	
	
    public String toggle(String s){
        String a="";
        for(char i:s.toCharArray()){
            a+= i>=65 && i<=91 ? (char)(i+32) :(char)(i-32);
        }
        return a;
    }


}
