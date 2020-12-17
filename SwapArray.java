public class SwapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=Scan.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array element");
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println("enter an element");
		a[i] = Scan.nextInt();
			
		}
		System.out.println("enter 2 indexes of an array");
		int i1=Scan.nextInt();
		int i2=Scan.nextInt();
		System.out.println("enete number before swapping");
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int help;
		help=a[i1];
		a[i1]=a[i2];
		a[i2]=help;
		System.out.println("enete number after swapping");
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.print(a[i]+" ");
		}

	}