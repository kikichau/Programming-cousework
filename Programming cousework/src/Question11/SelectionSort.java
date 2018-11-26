package Question11;

// Java program for implementation of Selection Sort 
class SelectionSort 
{ 
	void selectionSort(int arr[]) 
	{ 
		int n = arr.length; 

		// One by one move boundary of unsorted subarray 
		for (int i = 0; i < n-1; i++) 
		{ 
			// Find the minimum element in unsorted array 
			int min_idx = i; 
			for (int j = i+1; j < n; j++) 
				if (arr[j] < arr[min_idx]) 
					min_idx = j; 

			// Swap the found minimum element with the first 
			// element 
			int temp = arr[min_idx]; 
			arr[min_idx] = arr[i]; 
			arr[i] = temp; 
                        
                        System.out.println("After Sort: ");
                        printArray(arr);
		} 
	} 

	// Prints the array 
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver code to test above 
	public static void main(String args[]) 
	{ 
		SelectionSort ob = new SelectionSort(); 
		int arr[] = {30, 13, 22, 90}; 
                System.out.println("Start Sort:"); 
                ob.printArray(arr);
                
		ob.selectionSort(arr);
                
		System.out.println("Finally Sort:"); 
		ob.printArray(arr); 
	} 
} 
/* This code is contributed by Rajat Mishra*/

