package Question11;

public class BubbleSort {
 
    static void bubbleSort(int[] arr) {  
        int n = arr.length;
        
        for (int i = 0; i < n-1; i++)

        for (int j = 0; j < n-i-1; j++)
            
        if (arr[j] > arr[j+1]) {
            // swap temp and arr[i]
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp; 
            
            System.out.println("After Sort: ");
            printArray(arr);
        }
    }

    static void printArray(int arr[]){
        int n = arr.length;
        
        for (int i=0; i<n; ++i)
        System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void main(String args[]) {
        int arr[] ={30, 13, 22, 90};  
        
        System.out.println("Start Sort:"); 
        printArray(arr);
        
        bubbleSort(arr);//sorting arr elements using bubble sort  

        System.out.println("Finally Sort:");  
        printArray(arr); 
    }
}
