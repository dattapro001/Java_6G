import java.lang.*;


   //This is Single Task Multiple Thread.
     class Test1 extends Thread {
	public void run() {
		System.out.println("Single Task Single Thread");
	}
      }
    public class Test{
	public static void main(String[] args) {
		Test1 t = new Test1();
		
		t.start();

	}

}

     
    //This is Single Task Multiple Thread
       class Test1 extends Thread{
    	  public void run() {
    		  System.out.println("Single task Multiple Thread");
    	  }
       }
      public class Test{
      
      public static void main(String[] args) {
    	  Test1 t = new Test1();
    	  Test1 t1= new Test1();
    	  Test1 t2= new Test1();
    	  Test1 t3= new Test1();
    	  t.start();
    	  t1.start();
    	  t2.start();
    	  t3.start();
    	  
      }
    	  
      }

      //This is Multiple Task Multiple Thread
       
         class Test1 extends Thread {
        	@Override
        	public void run() {
        		System.out.println("Multiple Task Multiple Thread No.1");
        	}
           }
        	
          class Test2 extends Thread{
        		@Override
        		public void run() {
        		System.out.println("Multiple Task Multiple Thread No.2");	
        		}
          }
        		
          class Test3 extends Thread{
            	public void run() {
            	System.out.println("Multiple Task Multiple Thread No.3");	
            	}
          }
            	
           class Test4 extends Thread{
           		public void run() {
           		System.out.println("Multiple Task Multiple Thread No.4");	
            	}
           }
        		public class Test{        
        	public static void main(String[] args)  {
        		
        		Test1 t1  = new Test1();
        		Test2 t2 = new Test2();
        		Test3 t3 = new Test3();
        		Test4 t4 = new Test4();
        
        		t1.start();
        		t2.start();
        		t3.start();
        		t4.start();
        	}
        	}
        
