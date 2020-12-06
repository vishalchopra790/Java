
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String  str="Vishal";
     String t="";
     for(int i=str.length()-1;i>=0;i--) {
          t= t+str.charAt(i);
          System.out.println(t);
          if (str==t) {
         	 System.out.println("passed");
          }
          else {
         	 System.out.println("failed");
          }
     }
     System.out.println(t);
   
	}

}
