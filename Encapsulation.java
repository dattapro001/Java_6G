//Encapsulation is one of the four fundamental OOP concepts. The other three are inheritance, polymorphism, and abstraction.
//Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
//In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class.
//Therefore, it is also known as data hiding.


public class Encapsulation {
	private int fNum;
	private int sNum;
	private int Sum;
	
	public void setfNum(int fNum) {
		this.fNum = fNum;
	}
	public void getfNum() {
		this.fNum = fNum;
	}
	public void getSum() {
		this.Sum = Sum;
	}
	public void add() {
		Sum = fNum + fNum;
		System.out.println(Sum);
	}

	


	public static void main(String[] args) {
		
          Encapsulation Ecap = new Encapsulation ();
          Ecap.setfNum(20);
          Ecap.setfNum(20);
          Ecap.add();
	}
}
	


