
public class Variables {
	String name;  //Instance Variable
	static String city;
	String address;
	static int i=0;//class variables
	static {
		city="Delhi";  ///Static block here we define the Static variables value 
	}

	public Variables(String name, String address) {
		this.name = name;
		this.city = city;
		this.address = address;/// Local variables
         i++;
         //System.out.println(i);
	}
	public static void getcity() {  //static method
		System.out.println(city);
	}

	public void getadress() {
		System.out.println(i+name+address + " " + city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables c = new Variables("Vishal",  "Uttam nagar");
		Variables d = new Variables("Sahil", "Ramesh nagar");

		c.getadress();
		d.getadress();
        c.getcity();
        Variables.i=5;
	}

}
