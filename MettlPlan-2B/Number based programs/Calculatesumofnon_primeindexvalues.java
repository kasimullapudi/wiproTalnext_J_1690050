package mettl2B;

public class Calculatesumofnon_primeindexvalues {
	//3m
	public int findNonPrimeIndexValues(int[] input1,int input2) {
		
		// Write code here...
        int sum=0;
		for(int i=0;i<input2;i++){
            if(!(isPrime(i)))sum+=input1[i];
        }
        return sum;
	}
	
	
    public boolean isPrime(int n){
        if(n==0 || n==1)return false;
        if(n==2) return true;
        for(int i=2;i<n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
