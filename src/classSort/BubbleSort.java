package classSort;
import java.util.ArrayList;

public class BubbleSort {
	// for Array Integer Parameter
	public void bubbleSortArrInt(int[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n; i++) {
	        // Last i elements are already sorted
	        for (int j = 0; j < n-i-1; j++) {
	            // Traverse through the unsorted portion of the array
	            if (arr[j] > arr[j+1]) {
	                // Swap adjacent elements if they are in the wrong order
	                int temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	            }
	        }
	    }
	}
	
	// for ArrayList Integer Parameter
	public void bubbleSortArrListInt(ArrayList<Integer> arr) {
	    int n = arr.size();
	    for (int i = 0; i < n; i++) {
	        // Last i elements are already sorted
	        for (int j = 0; j < n-i-1; j++) {
	            // Traverse through the unsorted portion of the array
	            if (arr.get(j) > arr.get(j+1)) {
	                // Swap adjacent elements if they are in the wrong order
	                int temp = arr.get(j);
	                arr.set(j, arr.get(j+1));
	                arr.set(j+1, temp);
	            }
	        }
	    }
	}
	
	// for Array Char Parameter
	public void bubbleSortArrChar(char[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n; i++) {
	        // Last i elements are already sorted
	        for (int j = 0; j < n-i-1; j++) {
	            // Traverse through the unsorted portion of the array
	            if (arr[j] > arr[j+1]) {
	                // Swap adjacent elements if they are in the wrong order
	                char temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	            }
	        }
	    }
	}
	
	// for ArrayList Char Parameter
	public void bubbleSort(ArrayList<Character> arr) {
	    int n = arr.size();
	    for (int i = 0; i < n; i++) {
	        // Last i elements are already sorted
	        for (int j = 0; j < n-i-1; j++) {
	            // Traverse through the unsorted portion of the array
	            if (arr.get(j) > arr.get(j+1)) {
	                // Swap adjacent elements if they are in the wrong order
	                char temp = arr.get(j);
	                arr.set(j, arr.get(j+1));
	                arr.set(j+1, temp);
	            }
	        }
	    }
	}



}
