
public class Addition_using_Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Output=1,2,3,5,8,13
		int a=0;
	    int b=1;
		int Sum =0;
		
		for(int i=1; i<=1000; i++) {
					   
			a=b;
			b=Sum;
			Sum = a+b;				
			System.out.println("Addition    " + Sum);
				
}
	
}

}
