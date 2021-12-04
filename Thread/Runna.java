   //Runnable Single task Single Thread
   class Runna implements  Runnable {
	 public void run() {
		 System.out.println("Runnable Single task Single Thread");
	 }
 
	public static void main(String[] args) {
		Runna runna = new Runna();
		Thread t = new Thread(runna);
		t.start();

	}

      }


      //Runnable Single Task Multiple Thread
        class Runna implements Runnable{
        	public void run() {
        		System.out.println("Runnable Single Task Multiple Thread");
        		
        	}
        	public static void main(String[] args) {
        		Runna runna = new Runna();
        		Thread t = new Thread(runna);
        		Thread t1= new Thread(runna);
        		Thread t2= new Thread(runna);
        		t.start();
        		t1.start();
        		t2.start();
        	
        }
        }
       //Runnable Multiple Task Multiple Thread
          class Runna1 implements Runnable{
        	  public void run() {
        		  System.out.println("Runnable Multiple Task Multiple Thread No.1");
        	  }
          }
          
          class Runna2 implements Runnable{
        	  public void run() {
        		  System.out.println("Runnable Multiple Task Multiple Thread No.2");
        	  }
          }
          
          class Runna3 implements Runnable{
        	  public void run() {
        		  System.out.println("Runnable Multiple Task Multiple Thread No.3");
        	  }
          }
          
          class Runna4 implements Runnable{
        	  public void run() {
        		  System.out.println("Runnable Multiple Task Multiple Thread No.4");
        	  }
          }
          
          public class Runna {
        	  public static void main(String[] args) {
        		  Runna1 runna1 = new Runna1();
        		  Runna2 runna2 = new Runna2();
        		  Runna3 runna3 = new Runna3();
        		  Runna4 runna4 = new Runna4();
        		  Thread t1 = new Thread(runna1);
        		  Thread t2 = new Thread(runna2);
        		  Thread t3 = new Thread(runna3);
        		  Thread t4 = new Thread(runna4);
        		  t1.start();
        		  t2.start();
        		  t3.start();
        		  t4.start();
        		  
        		  
        	  }
        		  
        	  }

  
             // Other Example of Multiple threading
             public class Runna implements Runnable {
                  public void run() {
            		
            		 System.out.println("Multiple Threading");
            		 
             }
            	
            	 public static void main(String[] args) throws InterruptedException{
            		 Runna runna = new Runna();
            		 Thread t1 = new Thread(runna);
            		 t1.start();
            		 for(int i=0;i<10;i++) {
            			System.out.println("Main Thread");
            			Thread.sleep(500);
            			}
            		 }
                }
             

          // One Thread Alive or not?
        public class Runna implements Runnable{
        	@Override
        	public void run() {
        		System.out.println("Thread name :" + Thread.currentThread().getName());
        	}
        	
        	public static void main(String[] args) {
        		Runna runna = new Runna();
        		Thread t = new Thread(runna);
        		t.start();
        		System.out.println("Main thread name :" + Thread.currentThread().getName());
        		System.out.println("Thread life :" +Thread.currentThread().isAlive());
        		System.out.println("Testing t life :" + t.isAlive());
        		}
        }









