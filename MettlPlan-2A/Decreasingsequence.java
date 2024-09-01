package mettl2A;
import java.util.*;
public class Decreasingsequence {
	//22m
	public Result decreasingSeq(int[] input1,int input2) {
	if(input2==1) return new Result(0,0);
    int decSeq=1;
    ArrayList<Integer> numdecSeq=new ArrayList<>();
    for(int i=0;i<input1.length-1;i++){
        if(input1[i]>input1[i+1]){
            System.out.println(input1[i]);
            decSeq++;
        }
        else{
            if(decSeq!=1)numdecSeq.add(decSeq);
            decSeq=1;
        }
    }
    System.out.println(numdecSeq);
    Iterator<Integer> l=numdecSeq.iterator();
    int[] arr=new int[numdecSeq.size()];
    int i=0;
    while(l.hasNext()){
        arr[i]=l.next();
        i++;
    }
    int max=1,sum=0;
    for(int j=0;j<arr.length;j++){
        if(arr[j]!=1)sum++;
        if(arr[j]>max){
            max=arr[j];
        }
    }
    return new Result(sum,max);
}
}
