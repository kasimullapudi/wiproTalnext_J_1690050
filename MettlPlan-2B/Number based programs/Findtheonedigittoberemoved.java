package mettl2B;

public class Findtheonedigittoberemoved {
	//15m 43s
	public int digitRemove_Palin(int input1) {
		// Write code here...
		// throw new UnsupportedOperationException("digitRemove_Palin(int input1)");
        if((""+input1).equals(new StringBuilder(""+input1).reverse().toString())) return -1;
        StringBuilder s=new StringBuilder(""+input1);
        String sa="",org="",rev="";

        int i=0;
        for(i=0;i<s.length();i++){
            sa=s.substring(0,i)+s.substring(i+1,s.length());
            System.out.println(sa);
            org=sa;
            rev=new StringBuilder(sa).reverse().toString();
            if(org.equals(rev)){
                break;
            }
        }
        return Integer.parseInt(""+s.charAt(i));
	}

}
