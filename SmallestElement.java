
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
	    System.out.println("Please enter elements in array");
	    int n=Scan.nextInt();
	    int a[]=new int[n];
	    System.out.println("Please enete elements in array");
	    for(int i=0; i<n; i++){
	    	a[i]=Scan.nextInt();
	    	
	    }
	    int smallest=a[0];
	    for(int i=1;i<n;i++)
	    {
	    	if(a[i]<smallest){
	    		smallest=a[i];
	    		
	    	}
	    }
	    System.out.println("Smallest element is"+smallest);	
         Scan.close();

	}

}