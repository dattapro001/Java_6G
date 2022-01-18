public class Interrupt2 extends Thread{
	public void run() {
		
		System.out.println(Thread.interrupted());// true then auto will false
		
		System.out.println(Thread.currentThread().isInterrupted());//print the false
		
		try {
			for(int i=0;i<=5;i++) {
				
				System.out.println(i);//print loop the 0
				interrupt();
				System.out.println(Thread.interrupted());//again true for interrupt
				interrupt();
				System.out.println(Thread.interrupted());//again true for interrupt then auto false
				System.out.println(Thread.currentThread().isInterrupted());//print the false
				interrupt();  //here interrupt so loop will not work
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		
		Interrupt2 t = new Interrupt2();
		t.start();
		t.interrupt(); //true
	}
}

//Output

//true
//false
//0
//true
//true
//false

