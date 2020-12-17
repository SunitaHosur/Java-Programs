import java.util.Scanner;
public class TablesProgram {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number");
		int n=scan.nextInt();
		
		int i=1;
		while( i<=10){
			System.out.println(n+"x"+i+"="+(n*i));
			i++;
		}
	}

}