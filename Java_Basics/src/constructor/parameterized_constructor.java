package constructor;

public class parameterized_constructor {
	
	
	
	String emp_location;
	String emp_name;
	
	parameterized_constructor(String location, String name){
		
		emp_location=location;
		emp_name=name;

	}
	
public void meter() {
	System.out.println("Employee details "+emp_location +   emp_name);	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		parameterized_constructor pc=new parameterized_constructor("coimbator",  "Harish");
		pc.meter();
		
	}

}
