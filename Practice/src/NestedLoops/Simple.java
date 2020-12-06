package NestedLoops;

public class Simple {
	public static void main(String[] args) {
		
		/*1 2 3 4
		5 6 7
		8 9
		10*/
		int k=3;
		for (int i=1;i<4;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				System.out.print("\t");
				k=k+3;
			}
			System.out.println("");
		}
		
}
}