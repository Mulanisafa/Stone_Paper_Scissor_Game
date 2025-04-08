package MultiThreading;

public class MT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread0 = new MyThread();
		thread0.start();
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().isDaemon());
		System.out.println("thraed:0"+thread0.isDaemon());
		thread0.setDaemon(true);
		System.out.println("thread0:"+thread0.isDaemon());
		
		Thread.yield();
		MyThread thread = new MyThread();
		thread.start();
		for(int i=0;i<5;i++) {
			System.out.println("main thread!!!");
		}

	}

}
