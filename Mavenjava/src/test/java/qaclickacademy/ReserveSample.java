package qaclickacademy;

import java.io.IOException;
import java.util.ArrayList;

public class ReserveSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ReverseDD data = new ReverseDD();
		ArrayList fu = new ArrayList();
		//fu.add(data.getdata("name"));
		fu.add(data.getdata("Address"));
		
		System.out.println(fu.get(0));

	}

}
