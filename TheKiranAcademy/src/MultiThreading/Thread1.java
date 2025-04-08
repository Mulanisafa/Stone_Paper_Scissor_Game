package MultiThreading;

public class Thread1 extends Thread{
	Table table;
	public Thread1(Table table) {
		this.table = table;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		table.Table(5);
		// for static
		Table.Table(8);
	}

}
