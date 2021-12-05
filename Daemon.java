// Checking Daemon Thread
public class Daemon extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");
		}
		else {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		System.out.println("Main thread");
		Daemon dem = new Daemon();
		dem.setDaemon(true);  //Set the dem is daemon or not
		dem.start();
	}

}
