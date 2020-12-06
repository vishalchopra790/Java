package DateandTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class calenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy hh:mm:ss hh");
		
		System.out.println(d.toString());
		System.out.println(sdf.format(d));

	}

}
