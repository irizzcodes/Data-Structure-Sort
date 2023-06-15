package classSort;
import java.util.ArrayList;

public class HeapSort {
	// Array Integer
	public void heapSortArrInt(int[] arr) {
	    int n = arr.length;
	    // Build heap (rearrange array)
	    for (int i = n / 2 - 1; i >= 0; i--)
	        heapifyArrInt(arr, n, i);
	    // One by one extract an element from heap
	    for (int i = n - 1; i >= 0; i--) {
	        // Move current root to end
	        int temp = arr[0];
	        arr[0] = arr[i];
	        arr[i] = temp;
	        // Call max heapify on the reduced heap
	        heapifyArrInt(arr, i, 0);
	    }
	}

	private void heapifyArrInt(int[] arr, int n, int i) {
	    int largest = i; // Initialize largest as root
	    int l = 2 * i + 1; // left = 2*i + 1
	    int r = 2 * i + 2; // right = 2*i + 2
	    // If left child is larger than root
	    if (l < n && arr[l] > arr[largest])
	        largest = l;
	    // If right child is larger than largest so far
	    if (r < n && arr[r] > arr[largest])
	        largest = r;
	    // If largest is not root
	    if (largest != i) {
	        int swap = arr[i];
	        arr[i] = arr[largest];
	        arr[largest] = swap;
	        // Recursively heapify the affected sub-tree
	        heapifyArrInt(arr, n, largest);
	    }
	}
	
	
	// Array Char
	public void heapSortArrChar(char[] arr) {
	    int n = arr.length;
	    // Build heap (rearrange array)
	    for (int i = n / 2 - 1; i >= 0; i--)
	        heapifyArrChar(arr, n, i);
	    // One by one extract an element from heap
	    for (int i = n - 1; i >= 0; i--) {
	        // Move current root to end
	        char temp = arr[0];
	        arr[0] = arr[i];
	        arr[i] = temp;
	        // Call max heapify on the reduced heap
	        heapifyArrChar(arr, i, 0);
	    }
	}

	private void heapifyArrChar(char[] arr, int n, int i) {
	    int largest = i; // Initialize largest as root
	    int l = 2 * i + 1; // left = 2*i + 1
	    int r = 2 * i + 2; // right = 2*i + 2
	    // If left child is larger than root
	    if (l < n && arr[l] > arr[largest])
	        largest = l;
	    // If right child is larger than largest so far
	    if (r < n && arr[r] > arr[largest])
	        largest = r;
	    // If largest is not root
	    if (largest != i) {
	        char swap = arr[i];
	        arr[i] = arr[largest];
	        arr[largest] = swap;
	        // Recursively heapify the affected sub-tree
	        heapifyArrChar(arr, n, largest);
	    }
	}
	
	// ArrayList Integer
	public void heapSortArrListInt(ArrayList<Integer> arr) {
	    int n = arr.size();
	    // Build heap (rearrange array)
	    for (int i = n / 2 - 1; i >= 0; i--)
	        heapifyArrListInt(arr, n, i);
	    // One by one extract an element from heap
	    for (int i = n - 1; i >= 0; i--) {
	        // Move current root to end
	        int temp = arr.get(0);
	        arr.set(0, arr.get(i));
	        arr.set(i, temp);
	        // Call max heapify on the reduced heap
	        heapifyArrListInt(arr, i, 0);
	    }
	}

	private void heapifyArrListInt(ArrayList<Integer> arr, int n, int i) {
	    int largest = i; // Initialize largest as root
	    int l = 2 * i + 1; // left = 2*i + 1
	    int r = 2 * i + 2; // right = 2*i + 2
	    // If left child is larger than root
	    if (l < n && arr.get(l) > arr.get(largest))
	        largest = l;
	    // If right child is larger than largest so far
	    if (r < n && arr.get(r) > arr.get(largest))
	        largest = r;
	    // If largest is not root
	    if (largest != i) {
	        int swap = arr.get(i);
	        arr.set(i, arr.get(largest));
	        arr.set(largest, swap);
	        // Recursively heapify the affected sub-tree
	        heapifyArrListInt(arr, n, largest);
	    }
	}

	
	
	// ArrayList Char
	public void heapSortArrListChar(ArrayList<Character> arr) {
	    int n = arr.size();
	    // Build heap (rearrange array)
	    for (int i = n / 2 - 1; i >= 0; i--)
	        heapifyArrListChar(arr, n, i);
	    // One by one extract an element from heap
	    for (int i = n - 1; i >= 0; i--) {
	        // Move current root to end
	        char temp = arr.get(0);
	        arr.set(0, arr.get(i));
	        arr.set(i, temp);
	        // Call max heapify on the reduced heap
	        heapifyArrListChar(arr, i, 0);
	    }
	}

	private void heapifyArrListChar(ArrayList<Character> arr, int n, int i) {
	    int largest = i; // Initialize largest as root
	    int l = 2 * i + 1; // left = 2*i + 1
	    int r = 2 * i + 2; // right = 2*i + 2
	    // If left child is larger than root
	    if (l < n && arr.get(l) > arr.get(largest))
	        largest = l;
	    // If right child is larger than largest so far
	    if (r < n && arr.get(r) > arr.get(largest))
	        largest = r;
	    // If largest is not root
	    if (largest != i) {
	        char swap = arr.get(i);
	        arr.set(i, arr.get(largest));
	        arr.set(largest, swap);
	        // Recursively heapify the affected sub-tree
	        heapifyArrListChar(arr, n, largest);
	    }
	}



}
