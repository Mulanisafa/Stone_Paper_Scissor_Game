package MultiThreading;

public class MyThread1  implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i =0;i<5;i++) {
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e){
				e.printStackTrace();
				
			}
			System.out.println(Thread.currentThread().getName()+ " says " + " Good morning ");
			
			
		}
		
	}

}
