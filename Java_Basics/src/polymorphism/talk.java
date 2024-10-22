package polymorphism;

public class talk {
	
	/////METHOD OVERLOADING
	
	public void talking(Parents styleoftalk) {
		System.out.println("Polite");
		
	}
    public void talking(Friend styleoftalk) {
		System.out.println("Jolly");
		
	}
    public void talking(son styleoftalk) {
		
		System.out.println("Personal");
	}
    
    public static void main(String[]args) {
    	talk tk=new talk();
    	
    	Parents pa=new Parents();
    	tk.talking(pa);
    	
    	Friend fr=new Friend();
    	tk.talking(fr);
    	
    	
    }
}
