 case # 1
We have to create daemon thread before starting the Thread. Otherwise, it will through runtime
exception (IllegalThreadStateException)
	
	case # 2
We can’t create main thread as Daemon thread. Why? Read carefully case # 1.
What will happen, if we write in the main method “ ? (Again read case # 1 carefully)
N.B : whenever JVM in the main method, it will create the main thread immidiately. After that, we
know, we can’t make it as a daemon thread.

case # 3
If there is no task of a thread, then, it’s daemon thread will also not perform any task. Because,
Daemon thread rum in the background of a thread.



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


       //Make daemon After Start
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
		dem.start();
		dem.setDaemon(true);  //Set the dem is daemon or not
		// It will show(IllegalThreadStateException)
	}
         }



