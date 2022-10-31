package c2tc_corejava;

public class ImplementRunnable implements Runnable {

	public static void main(String[] args) {
		ImplementRunnable t=new ImplementRunnable ();
		Thread t1=new Thread(t);
				t1.start();
		// TODO Auto-generated method stub

	}
	public void run() {
		System.out.println("RunnableInterface");
		
	}

}
