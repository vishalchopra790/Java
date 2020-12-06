package qaclickacademy;

import java.io.IOException;
import java.util.ArrayList; 	

public class TestSampleDDE {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataDrivenExcel s=new DataDrivenExcel();
		ArrayList fu=s.getData("ggg");

	
		System.out.println(fu.get(0));
		System.out.println(fu.get(1));
		System.out.println(fu.get(2));
		System.out.println(fu.get(3));
		

	}
	
}
