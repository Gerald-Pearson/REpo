package atHomeAssignments;

public class bubbleSort
{
	/*
	 * sorts Array values into order
	 */
	public void bubbSort(int arr[])
	{
		int w= arr.length;
		// iter thru the value of arrays length
		for(int i=0; i<w-1;i++) 
		{
			// moves values within the array
			for(int l=0; l<w-i-1;l++)
			{
				if(arr[l]>arr[l+1])
				{
					int temp=arr[l];
					arr[l]= arr[l+1];
					arr[l+1]=temp;
				}//end if 
			}//end for inter loop
		}//end outer for loop 
		
		
	}
	/*
	 * displays values in console
	 * 
	 */
	public void printDisplay(int arr[])
	{
		int n = arr.length;
		for(int i:arr )
		{
			System.out.println(arr[i]+" ");
		}
	}
}
