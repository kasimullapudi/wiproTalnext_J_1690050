package mettl2B;

public class UserIDGeneration {
	//18m 37s
	public String userIdGeneration(String input1,String input2,int input3,int input4) {
		// TODO Auto-generated method stub
		// Write code here...
		String small="",large="";
        if(input1.length()==input2.length()){
            small= isFirstSmall(input1,input2) ? input1 : input2;
            large= isFirstSmall(input1,input2) ? input2 : input1;
        }
        else{
            if(input1.length()<input2.length()){
                small=input1;
                large=input2;
            }
            else{
                small=input2;
                large=input1;
            }
        }
        String userId=small.charAt(small.length()-1)+large+(""+input3).charAt(input4-1);
        userId+=new StringBuilder(""+input3).reverse().charAt(input4-1);
        return toggle(userId);
	}
	
	
	
	
    public boolean isFirstSmall(String first,String last){
        String f=first.toLowerCase();
        String l=last.toLowerCase();
        for(int i=0;i<f.length();i++){
            // System.out.println((int)f.charAt(i)+" "+(int)l.charAt(i));
            if(f.charAt(i)<l.charAt(i)){
                // System.out.println(f.charAt(i));
                return true;
            }
            else if(f.charAt(i)>l.charAt(i)){
                return false;
            }
        }
        return false;
    }
    
    
    public String toggle(String s){
        String a="";
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                a+=(""+s.charAt(i)).toLowerCase();
            }
            else{
                a+=(""+s.charAt(i)).toUpperCase();
            }
        }
        return a;
    }
}

