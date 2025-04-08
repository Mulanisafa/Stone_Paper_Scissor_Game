package MultiThreading;

public class Table {
	synchronized static void Table(int n) {
		for(int i =0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+"--->"+n+"* "+i+" = "+(n*i));
			try {
				Thread.sleep(500);
				
			}catch(InterruptedException e){
				e.printStackTrace();
				
			}
			
		}
		
	}

}
