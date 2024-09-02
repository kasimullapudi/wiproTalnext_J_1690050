package mettl2B;

public class TheNambiarNumberGenerator {
	//34m 34s
	public int nnGenerator(String input1) {
		// Write code here...
		// throw new UnsupportedOperationException("nnGenerator(String input1)");
        int i=0,sum=0;
        char[] arr=input1.toCharArray();
        String res="";
        while(true){
            
            if(i>arr.length-1) break;
            // System.out.println(arr[i]);
            sum=0;
            if(con(arr[i])%2==0){
                // System.out.println("next pass starts from: "+arr[i]);
                while(i<=arr.length-1){
                    // System.out.println("inner loop: "+arr[i]);
                    sum+=con(arr[i]);
                    i++;
                    if(sum%2==1)break;
                }
                
            }
            else{
                // System.out.println("next pass starts from: "+arr[i]);
                 while(i<=arr.length-1){
                    // System.out.println("inner loop: "+arr[i]);
                    sum+=con(arr[i]);
                    i++;
                    if(sum%2==0)break;
                }
                
            }
            // System.out.println("sum: "+sum);
            res+=sum;
        }
        return con(res);
        
	}

	
	
    public int con(char c){
        return Integer.parseInt(""+c);
    }
    
    
    
    public int con(String s){
        return Integer.parseInt(s);
    }
}
