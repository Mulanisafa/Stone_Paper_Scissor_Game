package MultiThreading;

public class MyThread2 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i =0;i<5 ;i++) {
			System.out.println("Bye bye"+Thread.currentThread().getName());
		}
	}

}
