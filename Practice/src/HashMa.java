import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer,String> hp=new HashMap<Integer,String>();
        hp.put(1, "vsiahal");
        hp.put(2, "sahil");
        hp.put(3, "alka");
        hp.put(4, "rajesh");
        System.out.println(hp);
        System.out.println(hp.get(2));
        Set sn=hp.entrySet();
        Iterator it=sn.iterator();
        while(it.hasNext()) {
        	Map.Entry mp=(Map.Entry)it.next();
        	System.out.println(mp.getKey());
        	System.out.println(mp.getValue());
        }
	}

}
