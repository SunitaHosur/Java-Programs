import java.util.Scanner;

public class CopyChar {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int n=Scan.nextInt();
		char[] a=new char[n];
		System.out.println("enter array element");
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println("enter an element");
		a[i] = Scan.next().charAt(0);
			
		}
		char b[]=new char[a.length];
		for(int i=0; i<=a.length-1; i++)
		{
			
			b[i]=a[i];
		}
		System.out.println("element after copying");
		for(int i=0; i<=b.length-1; i++)
		{
			System.out.println(b[i]+" ");
		}

	}

}