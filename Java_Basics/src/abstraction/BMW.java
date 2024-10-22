package abstraction;

public class BMW extends car implements BUS{
	
	
	public void Engine() {
		
		System.out.println("BMW ENGINE");
		
	}
	public void Gear() {
		
		System.out.println("BMW GEAR");
	}
	
	
	public static void main(String [] args) {
		
		car cr = new BMW();
		
		
	}
	public void method() {
		System.out.println("This is method");
		
	}
	public void method2() {
		System.out.println("This is method 2");
		
	}

}
