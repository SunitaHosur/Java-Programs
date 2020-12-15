import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Please enter the numbre of element");
		int n=Scan.nextInt();
		int a[]=new int[n];
		int sum = 0;
		System.out.println("Please ente elements in array");
		for(int i=0; i<n; i++)
		{
			a[i]=Scan.nextInt();
		}
		for(int i=0; i<n; i++)
		{
			sum=sum+a[i];
		}
		float avg=(float)sum/n;
		System.out.println("Average element"+avg);
	}
	}
