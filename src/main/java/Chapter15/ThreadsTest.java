package Chapter15;

public class ThreadsTest {
	
	public static void main(String[] args)
	{
		Runnable Threadjob = new ThreadDemo();
		Runnable Threadjob1 = new ThreadDemo1();
		Thread t1 = new Thread(Threadjob);
		Thread t2 = new Thread(Threadjob1);
		t1.start();
		t2.start();
	}

}
