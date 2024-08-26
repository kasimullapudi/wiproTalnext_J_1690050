package pbl_app_MultiThread;
import java.util.*;

class Threads2 implements Runnable{
	String colours[]={"white","blue","black","green","red","yellow"};
	Random rand=new Random();
	int randN;
	public void run() {
		
		while(true) {
			randN=rand.nextInt(colours.length-1);
			if(colours[randN]!="red") {
				System.out.println(colours[randN]);
			}
			else {
				System.out.println("Breaking loop because got 'red'.......");
				break;
			}
		}
	}
}


public class ThreadCreation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads2 t=new Threads2();
		Thread thread=new Thread(t);
		thread.start();
	}

}
