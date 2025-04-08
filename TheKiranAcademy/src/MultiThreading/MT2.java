package MultiThreading;

public class MT2 {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread1 t2 = new MyThread1();
		
		Thread p = new Thread(t1);
		Thread q = new Thread(t2);
		
		p.setName("Thread p");
		q.setName("Thread Q");
		
		p.start();
		q.start();
		
		
	}

}
