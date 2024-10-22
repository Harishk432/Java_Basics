package static_method;

public class staticmethod {
	
	
	public static void StaticMethod() {
		
		System.out.println("I am static");
		}
	
	public void Nonstatic() {
		System.out.println("I am non static");
	}	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	StaticMethod();
	
	staticmethod sm=new staticmethod();
	sm.Nonstatic();
	
	}

}
