// Java implementation of the approach 
class GFG { 

	// Function to return the minimum 
	// required value 
	static int findMinValue(int arr[], int n) 
	{ 

		// Find the sum of the 
		// array elements 
		long sum = 0; 
		for (int i = 0; i < n; i++) 
			sum += arr[i]; 

		// Return the required value 
		return ((int)(sum / n) + 1); 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
		int arr[] = { 1,2,3,4,5 }; 
		int n = arr.length; 

		System.out.print(findMinValue(arr, n)); 
	} 
} 
    