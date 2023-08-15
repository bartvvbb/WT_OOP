
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		Product p1 = new Product();
		p1.name = "TV";
		p1.age = 22;
		p1.auth = false;
		p1.start();
		
		Product p2 = new Product();
		p2.name = "Wasmachine";
		p2.auth = true;
		p2.age = 44;
		p2.printage();
		
		p1.setName("Magentron");
		System.out.println("nieuwe prop" + p1.name);
		
		String name = p1.whatisyourname();
		System.out.println("naam " + name);
		
		
		
	}


	
}
