package exceptipnHandle;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=7;
       int b =0;
       try {
    	 int  c=a/b;
    	   System.out.println(c);
       }
        catch(ArithmeticException et) {
        	System.out.println("msthematical problem");
    	   
       }
       catch(Exception E) {
    	   System.out.println("I got the error");
    	   
       }
      finally {
    	  System.out.println("delete");
      }
	}

}
//try catch block is manadatory
//catch block should folowed by try block
//we can use multiple catch block
//try finally can be used together irrespective of catch block
//finally block will execute no matters if your script is passing or failing 