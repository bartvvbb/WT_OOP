
public class Product {
	
	public String name;
	public int age;
	public boolean auth;
	
	public Product() {
		System.out.println("In constructor");
		name = "Jeff";
		age = 100;
	}
	
	public Product(String name) {
		this.name = name;
		age = 40;
		// in application Product p3 = new Product("");
	}
	
	public void start() {
		System.out.println("In start");
		
	}
	public void printage() {
		System.out.println(age);
		
	}
	public void setName(String newName) {
		//Properties + arguemnts
		
		name = newName;
		
	}
	
	public void auth(boolean auth) {
		//thisauth is het huidige object en dus de prop name
		
		this.auth = auth;
		
	}
	
	public String whatisyourname() {
		
		return name;
	}
	
}
