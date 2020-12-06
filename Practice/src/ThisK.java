
public class ThisK {
	int a=9;
	public void get() {
		int a=3;
		int b=a+this.a;
		System.out.println(this.a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisK c=new ThisK();
		c.get();

	}

}
