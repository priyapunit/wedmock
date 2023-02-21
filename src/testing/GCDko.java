package testing;

public class GCDko {
	public void gcd(int a,int b) {
		int answer=1,i;
		for (i=1;i<=a&&i<=b;a++) {
			
			
			if (a%i==0 && b%i==0) {
				answer=i;
				a=1;
						
			}System.out.println(i);
		}
		System.out.println(answer);
	}
	public static void mai(String[] arg)
			{
		
		GCDko obje= new GCDko();
		obje.gcd(12,8);
		
			}
}
