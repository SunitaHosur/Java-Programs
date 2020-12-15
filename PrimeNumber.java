public class Prime {

	public static void main(String[] args) {
		int n=8;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				System.out.println("Number is prime");
				System.exit(0);
				
			}
		}
		System.out.println("Num is not prime");

	}

}
