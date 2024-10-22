package polymorphism;

public class son extends Parents{
	
	//METHOD OVERRIDING
	@Override
	public void Marriage() {
		
		System.out.println("My rules");
			}
	
	public static void main(String[] args) {
		
		Parents pr = new son();  //parentclass obj= new childclass()  Dynamic polymorphism
		pr.Property();
		pr.Marriage();
		
	}

}
