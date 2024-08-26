package pbl_app_MultiThread;

class Threads extends Thread{
	public void run() {
		
	}
}

public class ThreadCreation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		Threads t1=new Threads();
		Threads t2=new Threads();
		t1.setName("Scooby");
		t2.setName("Shaggy");
		System.out.println("Thread 1 name: "+t1.getName());
		System.out.println("Thread 2 name: "+t2.getName());
		
	}

}
