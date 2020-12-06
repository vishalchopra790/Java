package AbstractionConc;

public class Child extends GlobalAirlines{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.bodyColor();
		c.engine();

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("color is black");
		
	}

}
