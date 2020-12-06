
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int c[]= {2,4,5,6,8,9,9};
		for (int i=0;i<c.length;i++)
		{
			//sum=sum+c[i];
			//System.out.println("Total is "+sum);
			System.out.println(c[i]);
			if(c[i]==5)
			{
				System.out.println(i);
				break;
			}
		
		}

	}

}
