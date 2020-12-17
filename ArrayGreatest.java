public class ArrayGreatest {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
	    System.out.println("Please enter elements in array");
	    int n=Scan.nextInt();
	    int a[]=new int[n];
	    System.out.println("Please enete elements in array");
	    for(int i=0; i<n; i++){
	    	a[i]=Scan.nextInt();
	    	
	    }
	    int greatest=a[0];
	    for(int i=1;i<n;i++)
	    {
	    	if(a[i]>greatest){
	    		greatest=a[i];
	    		
	    	}
	    }
	    System.out.println("Greatest element"+greatest);	
         Scan.close();
	}

}