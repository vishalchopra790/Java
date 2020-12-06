import java.util.HashSet;
import java.util.Iterator;

public class HashSett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("vishal");
		hs.add("xxx");
		hs.add("yyyy");
		hs.add("rrhhn");
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
		Iterator<String> i=hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
