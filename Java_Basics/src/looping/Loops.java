package looping;

public class Loops {
	
	
	public void forloop() {
		for(int i=0;i<=10;i++) {
			System.out.println("I AM FOR LOOP");
			
		}
		}
	//ENTRY CONTROLLED LOOP
public void Whileloop() {
	int i=10;
	
	while(i<10){
		
		System.out.println("Ï am whileloop");
	i++;
	}	
		
	}
//EXIT CONTROL LOOP
public void Dowhile() {
	int i=10;
	do{
		System.out.println("I am Do while");
		i++;
		}while(i<10);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Loops lp=new Loops();
      lp.Whileloop();
      lp.forloop();
      lp.Dowhile();
	}

}
