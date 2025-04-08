package MultiThreading;

public class Priority {
	
	public static void main(String[] args) {
		
		Table table = new Table();
		SThread1  th1 = new SThread1();
		SThread2  th2 = new SThread2();
		SThread3  th3 = new SThread3();
		
		System.out.println();
		System.out.println(Thread.currentThread().getPriority());
		
		 th1.setName("thread1");
		 th2.setName("thread2");
		 th3.setName("thread3");
		 
		 th1.setPriority(1);
		
		th1.start();
		th2.start();
		th3.start();
		
		
		
	}

}
