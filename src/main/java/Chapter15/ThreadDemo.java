package Chapter15;

public class ThreadDemo implements Runnable {

	public void run() {
		
		System.out.println("I am a "+Thread.currentThread().getName());
		
	}
	
	

}
