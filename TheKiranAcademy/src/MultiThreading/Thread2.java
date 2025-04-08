package MultiThreading;

public class Thread2 extends Thread {
	 
		Table table;//used for non static
		public  Thread2(Table table) {
			this.table = table;
			
			
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			table.Table(3);
			
			Table.Table(9);//used for static
		}


}
