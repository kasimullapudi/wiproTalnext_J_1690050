package mettl2A;
import java.util.*;
//13ma
public class GetCodeThroughStrings {

	public int getCodeThroughStrings(String input1) {
	        int n=0;
	        String[] words=input1.split("\\s+");
	        for(String i:words){
	            n+=i.length();
	        }

	        int sum=0,sum1=n;

	        while(sum1/10!=0){
	            n=sum1;
	            while(n!=0){
	                sum+=n%10;
	                n/=10;
	            }
	            sum1=sum;
	        }
	        System.out.println(sum1);
	        return sum;
		}
	
}
