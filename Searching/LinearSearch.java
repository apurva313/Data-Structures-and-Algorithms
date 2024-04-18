import java.io.*;

class LinearSearch { 
	// This function returns index of element x in arr[] 
	static int search(int arr[], int n, int x) 
	{ 
		for (int i = 0; i < n; i++) { 
			// Return the index of the element if the element 
			// is found 
			if (arr[i] == x) 
				return i; 
		} 

		// return -1 if the element is not found 
		return -1; 
	} 

    void display(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

	public static void main(String[] args) 
	{ 
		int[] arr = { 3, 4, 1, 7, 5 }; 
		int n = arr.length; 
		
		int x = 4; //yahan 4 ko search karenge

        System.out.println("The Array are: ");
        LinearSearch ob= new LinearSearch();
        ob.display(arr);

        System.out.println("We are Searching for: " + x);



		int index = search(arr, n, x); 
		if (index == -1) 
			System.out.println("Element is not present in the array"); 
		else
			System.out.println("Element found at position: " + index); 
	} 
} 
