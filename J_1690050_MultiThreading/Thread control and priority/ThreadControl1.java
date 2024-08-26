package pbl_app_MultiThread;
class Threads3 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i==6) {
				try {
					Thread.sleep(5000);
				} 
				catch (InterruptedException e) {}
			}
			System.out.println(i);
		}
	}
}
public class ThreadControl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads3 t=new Threads3();
		t.start();
	}

}
