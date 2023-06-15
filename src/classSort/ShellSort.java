package classSort;
import java.util.ArrayList;

public class ShellSort {
	// Array Integer
	public void shellSortArrInt(int[] arr) {
	    int n = arr.length;
	    for (int gap = n / 2; gap > 0; gap /= 2) {
	        for (int i = gap; i < n; i++) {
	            int temp = arr[i];
	            int j;
	            for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
	                arr[j] = arr[j - gap];
	            }
	            arr[j] = temp;
	        }
	    }
	}
	
	
	// Array Char
	public void shellSortArrChar(char[] arr) {
	    int n = arr.length;
	    for (int gap = n / 2; gap > 0; gap /= 2) {
	        for (int i = gap; i < n; i++) {
	            char temp = arr[i];
	            int j;
	            for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
	                arr[j] = arr[j - gap];
	            }
	            arr[j] = temp;
	        }
	    }
	}
	
	// ArrayList Integer
	public void shellSortArrListInt(ArrayList<Integer> arr) {
	    int n = arr.size();
	    for (int gap = n / 2; gap > 0; gap /= 2) {
	        for (int i = gap; i < n; i++) {
	            int temp = arr.get(i);
	            int j;
	            for (j = i; j >= gap && arr.get(j - gap) > temp; j -= gap) {
	                arr.set(j, arr.get(j - gap));
	            }
	            arr.set(j, temp);
	        }
	    }
	}
	
	// ArrayList Char
	public void shellSortArrListChar(ArrayList<Character> arr) {
	    int n = arr.size();
	    for (int gap = n / 2; gap > 0; gap /= 2) {
	        for (int i = gap; i < n; i++) {
	            char temp = arr.get(i);
	            int j;
	            for (j = i; j >= gap && arr.get(j - gap) > temp; j -= gap) {
	                arr.set(j, arr.get(j - gap));
	            }
	            arr.set(j, temp);
	        }
	    }
	}

	

	
}
