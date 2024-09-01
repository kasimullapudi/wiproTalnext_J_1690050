package mettl2A;
import java.util.*;
public class AdditionusingStrings {
	public String addNumberStrings(String input1,String input2) {
	//14m
	// Write code here...
	// throw new UnsupportedOperationException("addNumberStrings(String input1,String input2)");
    if(input1.length()>input2.length()) input2=addZeros(input2,input1.length()-input2.length());
    else input1=addZeros(input1,input2.length()-input1.length());
    
    char[] one=new StringBuilder(input1).reverse().toString().toCharArray();
    char[] sec=new StringBuilder(input2).reverse().toString().toCharArray();
    String res="";
    int c=0;
    int i=0;
    int val=0;
    while(i<Math.max(input1.length(),input2.length())){
        val=con(one[i])+con(sec[i])+c;
        // System.out.println(val);
        res+=val%10;
        if(val/10==0)c=0;
        else c=1;
        i++;
    }
    if(c==1) res+=1;
    return new StringBuilder(res).reverse().toString();
	}
	public static int con(char c){
	    return Integer.parseInt(""+c);
	}
	public static String addZeros(String s,int n){
	    String v="";
	    for(int i=0;i<n;i++){
	        v+="0";
	    }
	    return v+s; 
	}
}
