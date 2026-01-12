class FibbonacciSeries { 
 public static void main (String args[]) { 
	//fibonacci series

	//0 1 1 2 3 5
	int n=10;
	int a=0;
	System.out.println(a);
	int b=1;
	System.out.println(b);    
	for(int i=2; i<n; i++)
	{
		
		int c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		
	}
 } 

}