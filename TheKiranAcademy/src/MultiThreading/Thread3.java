package MultiThreading;

public class Thread3 extends Thread {
	Table table; // used for non static
	public  Thread3(Table table) {
		this.table = table;
		
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		table.Table(8);
		Table.Table(2);//used for static
	}

}
