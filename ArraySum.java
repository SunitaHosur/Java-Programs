import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Please enter the number of element");
		int n=Scan.nextInt();
		int arr[]=new int[n];
		int sum = 0;
		System.out.println("Please enete elements in array");
		for(int i=0; i<n; i++)
		{
			arr[i]=Scan.nextInt();
		}
		for(int i=0; i<n; i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("SumNumber="+sum);
	}
		

}
