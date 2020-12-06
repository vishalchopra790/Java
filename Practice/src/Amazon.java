import java.util.ArrayList;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Print the unique number 
		int a[]= {2,3,4,2,2,4,8,6,6};
		
		//Enpty Arraylist 
		ArrayList<Integer> ab=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			int k=0;
			if(!ab.contains(a[i])){
				ab.add(a[i]);
				 k++;
				for(int j=i+1;j<a.length;j++) {
					
				  if(a[i]==a[j]) {
					  k++;
				  }
				}
				System.out.println(a[i]+" "+k);
				//if(k==1) {
					//System.out.println("The number is unique"+a[i]);
				}
			}
			
		}
	}


