package classSort;

import java.util.ArrayList;

public class InsertionSort {
	// Array Integer
	public void insertionSortArrInt(int[] arr) {
	    for (int i = 1; i < arr.length; i++) {
	        int key = arr[i];
	        int j = i - 1;
	        while (j >= 0 && arr[j] > key) {
	            arr[j + 1] = arr[j];
	            j--;
	        }
	        arr[j + 1] = key;
	    }
	}
	
	// Array Char
	public void insertionSortArrChar(char[] arr) {
	    for (int i = 1; i < arr.length; i++) {
	        char key = arr[i];
	        int j = i - 1;
	        while (j >= 0 && arr[j] > key) {
	            arr[j + 1] = arr[j];
	            j--;
	        }
	        arr[j + 1] = key;
	    }
	}
	
	// ArrayList Integer
	public void insertionSortArrListInt(ArrayList<Integer> arr) {
	    for (int i = 1; i < arr.size(); i++) {
	        int key = arr.get(i);
	        int j = i - 1;
	        while (j >= 0 && arr.get(j) > key) {
	            arr.set(j + 1, arr.get(j));
	            j--;
	        }
	        arr.set(j + 1, key);
	    }
	}

	// ArrayList Char
	public void insertionSortArrListChar(ArrayList<Character> arr) {
	    for (int i = 1; i < arr.size(); i++) {
	        char key = arr.get(i);
	        int j = i - 1;
	        while (j >= 0 && arr.get(j) > key) {
	            arr.set(j + 1, arr.get(j));
	            j--;
	        }
	        arr.set(j + 1, key);
	    }
	}



	
}
