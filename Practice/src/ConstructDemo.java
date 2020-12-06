
public class ConstructDemo {
	 public ConstructDemo(String str) {
		 System.out.println(str);
	 }
	 public static void date(int a ) {
		 System.out.println(a);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructDemo c=new ConstructDemo("hello");
		date(5);
		c.date(5);

	}

}
