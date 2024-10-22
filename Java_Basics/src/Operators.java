
public class Operators {
	
	
	public void Addition() {
	
		int a=0;
		int b=1;
    	int sum=0;
		for (int i=0; i<100; i++) {
			
			a=b;
			b=sum;
			sum=a+b;
		    System.out.println("Addition"+"   "+   sum);
			
	
			
		}
		
	}

	
	
	public void substraction() {
			
		int number = 101;
		int n=1;
		int result;
		int score;
		
		for (int i=1; i<=100; i++) {
			
		
			result=number-i;
			score=result-1;
			
			System.out.println("Substraction" +"    "+result +   "-"   +n   +"="+   score );
			
		}
		
		
	}
	
	
	
public void Multiplication() {
	int number =1;
	
	for (int i=1; i<=100;i++) {
       
		int result=number*i;
		System.out.println("Multiplication" +"    "+number + "*"+ i+"="+result);
	}	
		
	}

public void Division() {
	
	for(int i=1; i<=100;i++) {
		
		if(i%2==0) {
		System.out.println("Division"+"    "+i);
		
		}	
		
	}
	
}
	
	
	
}
