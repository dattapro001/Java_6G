
//Two unused Variable collected
public class GarbageCollection {

	public static void main(String[] args) throws InterruptedException {
		GarbageCollection G1 = new GarbageCollection();
		GarbageCollection G2 = new GarbageCollection();
		
		G1 = null;
		System.gc();
		G2 = null;
		Runtime.getRuntime().gc();
	}
		@Override
		protected void finalize() throws Throwable {
			System.out.println("Garbage Collector Called -->");
			System.out.println("Garbage Collected :" + this);
	}

}


   //One unused Variable Collected
           public class GarbageCollection{
        	   public static void main(String[] args) {
        		   GarbageCollection G1 = new GarbageCollection();
        		   GarbageCollection G2 = new GarbageCollection();
        		   G1 = G2;
        		   System.gc();
        	   }
        	   protected void finalize() throws Throwable{
        		   System.out.println("Garbage Collector Called -->");
        		   System.out.println("Garbage Collected :" + this);
        		   }
        	   }
