package pbl_app_MultiThread;
class DemoThread extends Thread{
	DemoThread(){
		
	}
	DemoThread(String name){
		super(name);
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is running....");
	}
}

public class ThreadControl3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThread t1=new DemoThread("one");
		DemoThread t2=new DemoThread("two");
		DemoThread t3=new DemoThread("three");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		t3.start();
		t1.start();
	}

}
