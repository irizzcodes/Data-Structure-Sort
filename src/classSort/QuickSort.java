package classSort;

import java.util.ArrayList;

public class QuickSort {
	// For Array Integer
	public void quickSortArrInt(int[] arr) {
	    quickSortArrInt(arr, 0, arr.length - 1);
	}

	private void quickSortArrInt(int[] arr, int left, int right) {
	    if (left < right) {
	        int pivotIndex = partitionArrInt(arr, left, right);
	        quickSortArrInt(arr, left, pivotIndex - 1);
	        quickSortArrInt(arr, pivotIndex + 1, right);
	    }
	}

	private int partitionArrInt(int[] arr, int left, int right) {
	    int pivotValue = arr[right];
	    int i = left - 1;
	    for (int j = left; j < right; j++) {
	        if (arr[j] < pivotValue) {
	            i++;
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }
	    int temp = arr[i + 1];
	    arr[i + 1] = arr[right];
	    arr[right] = temp;
	    return i + 1;
	}
	
	// For Array Char
	public void quickSortArrChar(char[] arr) {
	    quickSortArrChar(arr, 0, arr.length - 1);
	}

	private void quickSortArrChar(char[] arr, int left, int right) {
	    if (left < right) {
	        int pivotIndex = partitionArrChar(arr, left, right);
	        quickSortArrChar(arr, left, pivotIndex - 1);
	        quickSortArrChar(arr, pivotIndex + 1, right);
	    }
	}

	private int partitionArrChar(char[] arr, int left, int right) {
	    char pivotValue = arr[right];
	    int i = left - 1;
	    for (int j = left; j < right; j++) {
	        if (arr[j] < pivotValue) {
	            i++;
	            char temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }
	    char temp = arr[i + 1];
	    arr[i + 1] = arr[right];
	    arr[right] = temp;
	    return i + 1;
	}
	
	// For ArrayList Integer
	public void quickSortArrListInt(ArrayList<Integer> arr) {
	    quickSortArrListInt(arr, 0, arr.size() - 1);
	}

	private void quickSortArrListInt(ArrayList<Integer> arr, int left, int right) {
	    if (left < right) {
	        int pivotIndex = partitionArrListInt(arr, left, right);
	        quickSortArrListInt(arr, left, pivotIndex - 1);
	        quickSortArrListInt(arr, pivotIndex + 1, right);
	    }
	}

	private int partitionArrListInt(ArrayList<Integer> arr, int left, int right) {
	    int pivotValue = arr.get(right);
	    int i = left - 1;
	    for (int j = left; j < right; j++) {
	        if (arr.get(j) < pivotValue) {
	            i++;
	            int temp = arr.get(i);
	            arr.set(i, arr.get(j));
	            arr.set(j, temp);
	        }
	    }
	    int temp = arr.get(i + 1);
	    arr.set(i + 1, arr.get(right));
	    arr.set(right, temp);
	    return i + 1;
	}
	
	//For ArrayList Char
	public void quickSortArrListChar(ArrayList<Character> arr) {
	    quickSortArrListChar(arr, 0, arr.size() - 1);
	}

	private void quickSortArrListChar(ArrayList<Character> arr, int left, int right) {
	    if (left < right) {
	        int pivotIndex = partitionArrListChar(arr, left, right);
	        quickSortArrListChar(arr, left, pivotIndex - 1);
	        quickSortArrListChar(arr, pivotIndex + 1, right);
	    }
	}

	private int partitionArrListChar(ArrayList<Character> arr, int left, int right) {
	    char pivotValue = arr.get(right);
	    int i = left - 1;
	    for (int j = left; j < right; j++) {
	        if (arr.get(j) < pivotValue) {
	            i++;
	            char temp = arr.get(i);
	            arr.set(i, arr.get(j));
	            arr.set(j, temp);
	        }
	    }
	    char temp = arr.get(i + 1);
	    arr.set(i + 1, arr.get(right));
	    arr.set(right, temp);
	    return i + 1;
	}



	


}
