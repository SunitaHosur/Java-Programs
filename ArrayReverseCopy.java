import java.util.Scanner;

public class ArrayReverseCopy {

	public static void main(String[] args) {
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
		int b[]=new int[a.length];
		int j=b.length-1;
		for(int i=0; i<=a.length-1; i++)
		{
			
			b[j]=a[i];
			j--;
		}
		System.out.println("element after copying");
		for(int i=0; i<=b.length-1; i++)
		{
			System.out.println(b[i]+" ");
		}

	}

}