import java.util.ArrayList;

public class Araylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("sahil");
		a.add("vishal");
		a.add(0, "rajesh");
		System.out.println(a);
		a.clear();
		System.out.println(a);
		
		System.out.println(a.isEmpty());

	}

}
