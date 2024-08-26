package pbl_app_MultiThread;
class ThreadsEven extends Thread{
	public void run() {
		for(int i=0;i<=20;i++) {
			if(i%2==0)System.out.println("even Thread: "+i);
		}
	}
}
class ThreadsOdd extends Thread{
	public void run() {
		for(int i=1;i<20;i++) {
			if(i%2==1)System.out.println("odd Thread: "+i);
		}
	}
}
public class ThreadControl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadsEven ev=new ThreadsEven();
		ThreadsOdd odd=new ThreadsOdd();
		ev.start();
		try {
			ev.join();
		} 
		catch (InterruptedException e) {}
		
		odd.start();
		try {
			odd.join();
		} 
		
		catch (InterruptedException e) {}
	}

}
