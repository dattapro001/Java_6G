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


//Child Thread Inherite The Priority
        public class Priority extends Thread{
        	@Override
        	public void run() {
        		System.out.println("Child Thread");
        		System.out.println("Child Thread Priority :" + Thread.currentThread().getPriority());
        	}
        	public static void main(String[] args) {
        		System.out.println("Main Thread new Priority :" + Thread.currentThread().getPriority());
        		Thread.currentThread().setPriority(10);
        		System.out.println("Main Thread old Priority :" + Thread.currentThread().getPriority());
        		Priority pro = new Priority();
        	    pro.start();
        	}
        }


