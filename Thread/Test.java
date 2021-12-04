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

              // Examples 
                      
                class Test extends Thread{
                	@Override
                	public void run() {
                		for(int i=0;i<10;i++) {
                			System.out.println("Extended Thread");
                			try {                            
                				Thread.sleep(500);
                			}catch(Exception e) {
                				e.printStackTrace();
                			}
                		}
                	}
                
               public static void main(String[] args) {
            	   Test t = new Test();
            	   t.start();
               }
               }


        // Finding the Thread Name
            public class Test{
            	public static void main(String[] args) {
            		System.out.print(Thread.currentThread().getName()); //getName use for default Thread name.
            		Thread.currentThread().setName("What is the name?");
            		
            	}
            }

            
      //Changing The Current Thread Name
            public class Test{
            	public static void main(String[] args) {
            		Thread.currentThread().setName("What is the name?");
            		System.out.print(Thread.currentThread().getName()); // To set the Thread name the print function have to use after setName.
            	}
            }

              
         // Sleep() Thread
            public class Runna extends Thread {
            	
            	public void run() {            		
            		try {
            			for(int i=1;i<=5;i++) {
            				//Thread.currentThread().setName("Thread-1");
                			System.out.println(i + " "+Thread.currentThread().getName());
                			Thread.sleep(5000);
            			}
            				
            			}
            		
            		catch(InterruptedException e) {
            			e.printStackTrace();
            		}
            	}
            		public static void main(String[] args) {
            		  Runna runna = new Runna();
            		  runna.start();
            		  Runna runna1 = new Runna();
            		  runna1.start();
            		}
            }


              //Yield() Thread
              public class Runna extends Thread{
            	  public void run() {
            		
            			  for(int i=1;i<=5;i++) {
            				  System.out.println(Thread.currentThread().getName()+" - "+i);
   			  }
		
            	  }
          	  
              public static void main(String[] args) {
            	  Runna runna = new Runna();
            	  runna.start();
            	  Thread.yield();
            	  for(int i=1;i<=5;i++) {
    				  System.out.println(Thread.currentThread().getName()+" - "+i);
            	  }
              }
              }

        
