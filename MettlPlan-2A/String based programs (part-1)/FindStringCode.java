package mettl2A;
import java.util.*;
public class FindStringCode {

	public static int findStringCode(String input1) {
		// TODO Auto-generated method stub
		 input1=input1.toUpperCase();
		HashMap<Character,Integer> alphs=new HashMap<>();
        char[] alphas="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        for(int i=1;i<=alphas.length;i++){
            alphs.put(alphas[i-1], i);
        }
        String[] words=input1.split("\\s+");
        // System.out.println(alphs);
        String res="";
        int len,j=0,sum;
        for(String i:words){
            sum=0;
            j=0;
            len=i.length();
            
            while(j<len/2){
                sum+=Math.abs((alphs.get(i.charAt(j))-alphs.get(i.charAt(len-j-1))));
                // System.out.println((alphs.get(i.charAt(j))-alphs.get(i.charAt(len-j-1))));
                j++;
            }
            if(len%2!=0){
                sum+=alphs.get(i.charAt(len/2));
                // System.out.println("odd values: "+i.charAt(len/2)+"  --"+alphs.get(i.charAt(len/2)));
            }
            res+=sum;
        }
        return Integer.parseInt(res);
	}
	}

