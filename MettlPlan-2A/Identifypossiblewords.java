package mettl2A;

public class Identifypossiblewords {
	//17m 29s
	public static String identifyPossibleWords(String input1,String input2) {
		// Write code here...
		// throw new UnsupportedOperationException("identifyPossibleWords(String input1,String input2)");
        String[] words=input2.split(":");
        int ind=input1.indexOf("_");
        String res="";
        StringBuilder s;
        for(int i=0;i<words.length;i++){
            if(words[i].length()!=input1.length()){
                continue;
            }
            else{
                s=new StringBuilder(input1);
                s.replace(ind, ind+1, ""+words[i].charAt(ind));
                if(s.toString().equalsIgnoreCase(words[i])){
                    res+=words[i].toUpperCase()+":";
                
                }
                
            }
            
        }
        return res.length()!=0 ? new StringBuilder(res).substring(0,res.length()-1).toString() :"ERROR-009";
	}
}


