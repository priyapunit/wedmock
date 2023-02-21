package testing;

public class Calculator

{
	int sum,su;
	public void addition()
	{	
		sum=a+b;
		System.out.println(sum);
	}
	static int a; static int b;
	public void sub() {
	
		su=a-b;
		System.out.println(su);
		
	}
	
public static void main (String[] arg) {
	
	Calculator ob= new Calculator();
	
	ob.addition( );
	ob.sub();
	
	
}
}
