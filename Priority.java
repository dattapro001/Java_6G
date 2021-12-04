// Thread Priority
public class Priority implements Runnable {
	public void run() {
		System.out.println((Thread.currentThread().getName()));
	}

	public static void main(String[] args) {
		Priority pro = new Priority();
        Thread t1 = new Thread(pro,"Frist Thread");
        Thread t2 = new Thread(pro,"Second Thread");
        Thread t3 = new Thread(pro,"Third Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
	}

}


//Checking main Thread Priority
     public class Priority{
    	 public void main(String[] args) {
    		 System.out.println(Thread.currentThread().getPriority());
    	 }
     }
