package classSort;

import java.util.ArrayList;

public class SelectionSort {
	// Array Integer
	public void selectionSortArrInt(int[] arr) {
	    for (int i = 0; i < arr.length - 1; i++) {
	        int minIndex = i;
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[j] < arr[minIndex]) {
	                minIndex = j;
	            }
	        }
	        if (minIndex != i) {
	            int temp = arr[i];
	            arr[i] = arr[minIndex];
	            arr[minIndex] = temp;
	        }
	    }
	}
	
	// Array Char
	public void selectionSortArrChar(char[] arr) {
	    for (int i = 0; i < arr.length - 1; i++) {
	        int minIndex = i;
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[j] < arr[minIndex]) {
	                minIndex = j;
	            }
	        }
	        if (minIndex != i) {
	            char temp = arr[i];
	            arr[i] = arr[minIndex];
	            arr[minIndex] = temp;
	        }
	    }
	}
	
	// ArrayList Integer
	public void selectionSortArrListInt(ArrayList<Integer> arr) {
	    for (int i = 0; i < arr.size() - 1; i++) {
	        int minIndex = i;
	        for (int j = i + 1; j < arr.size(); j++) {
	            if (arr.get(j) < arr.get(minIndex)) {
	                minIndex = j;
	            }
	        }
	        if (minIndex != i) {
	            int temp = arr.get(i);
	            arr.set(i, arr.get(minIndex));
	            arr.set(minIndex, temp);
	        }
	    }
	}

	// ArrayList Char
	public void selectionSortArrListChar(ArrayList<Character> arr) {
	    for (int i = 0; i < arr.size() - 1; i++) {
	        int minIndex = i;
	        for (int j = i + 1; j < arr.size(); j++) {
	            if (arr.get(j) < arr.get(minIndex)) {
	                minIndex = j;
	            }
	        }
	        if (minIndex != i) {
	            char temp = arr.get(i);
	            arr.set(i, arr.get(minIndex));
	            arr.set(minIndex, temp);
	        }
	    }
	}

	
	



}
