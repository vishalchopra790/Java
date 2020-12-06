package superD;

public class Child extends Parent {
	public Child() {
		super();
		System.out.println("Child");
	}
	String name="VishalJI";
	public void get() {
		System.out.println(super.name);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.get();
		

	}

}
