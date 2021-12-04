
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
	


