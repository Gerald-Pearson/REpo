package atHomeAssignments;

public class driver 
{
	public static void main (String [] args)
	{
		int[] unsortNums= {1,0,5,6,3,2,3,7,9,8,4};
		bubbleSort bubbles= new bubbleSort();
		bubbles.bubbSort(unsortNums);
		System.out.println("sorting....");
		bubbles.printDisplay(unsortNums);
		System.out.println("houses Sorted");
		fibonacci fb = new fibonacci();
		
		
		int[] fbOutput= new int[25];
		System.out.println(" Starting Fib");
		for (int i=0; i<=fbOutput.length-1;++i)
		{
			
			fbOutput[i]=fb.fib(i);
			if(i!= fbOutput.length-1)
			{
			System.out.println(fbOutput[i]);
			}
			else 
			{
				System.out.println("Done Fibbing");
				
			}
			
			
		}
		System.out.println("Reversing String");
		
		String inString="star";
		System.out.println(inString);
		char[] outChar= inString.toCharArray();
		
		for(int i=outChar.length-1; i>=0;--i)
		{
			System.out.print(outChar[i]);		
		}
		System.out.println(" ");
		System.out.println("Starting Factorial of given number");
		Factorical fc= new Factorical();
		int w;
		w= 12;
		System.out.println("The number is "+w+" Its Factorial "+ fc.factorial(w));
			
		
		
	}
	
}
 class fibonacci
 {
	  int  fib(int n)
	 {
		 if(n<=1)
		 {
			 return n;
		 }
		 return fib(n-1)+fib(n-2);
		 
	 }
 }
 class Factorical
 {
	 int factorial(int l)
	 {
		 int result=1;
		 int i;
		 for(i=2;i<=l;i++)
			 result*=i;	
		 
			 return result;
		 
	 }
 }
 
