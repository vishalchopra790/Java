package InterfaceConcept;

public class Developing implements Development {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Developing dev =new Developing();
    dev.Homepage();
    dev.login();
    dev.jaimatadi();
	}

	@Override
	public void Homepage() {
		// TODO Auto-generated method stub
		System.out.println("Developed");
		
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Dveloped1");
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("needs to be developed");
		
	}
	public void jaimatadi() {
		System.out.println("jai mata DI");
	}

}
