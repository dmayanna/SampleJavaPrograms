package Chapter15;

public class ThreadDemo1 implements Runnable {

	public void run() {
		
		System.out.println(" I am in demo2 and the thread is "+Thread.currentThread().getName());
		
	}
	
	

}
