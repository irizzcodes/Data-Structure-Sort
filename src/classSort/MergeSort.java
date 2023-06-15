package classSort;
import java.util.ArrayList;

public class MergeSort {
	// Array Integer
	public void mergeSortArrInt(int[] arr) {
	    int n = arr.length;
	    if (n <= 1) {
	        return;
	    }
	    int mid = n / 2;
	    int[] left = new int[mid];
	    int[] right = new int[n - mid];
	    for (int i = 0; i < mid; i++) {
	        left[i] = arr[i];
	    }
	    for (int i = mid; i < n; i++) {
	        right[i - mid] = arr[i];
	    }
	    mergeSortArrInt(left);
	    mergeSortArrInt(right);
	    mergeArrInt(left, right, arr);
	}

	private void mergeArrInt(int[] left, int[] right, int[] arr) {
	    int nL = left.length;
	    int nR = right.length;
	    int i = 0, j = 0, k = 0;
	    while (i < nL && j < nR) {
	        if (left[i] <= right[j]) {
	            arr[k] = left[i];
	            i++;
	        } else {
	            arr[k] = right[j];
	            j++;
	        }
	        k++;
	    }
	    while (i < nL) {
	        arr[k] = left[i];
	        i++;
	        k++;
	    }
	    while (j < nR) {
	        arr[k] = right[j];
	        j++;
	        k++;
	    }
	}
	
	// Array Char
	public void mergeSortArrChar(char[] arr) {
	    int n = arr.length;
	    if (n <= 1) {
	        return;
	    }
	    int mid = n / 2;
	    char[] left = new char[mid];
	    char[] right = new char[n - mid];
	    for (int i = 0; i < mid; i++) {
	        left[i] = arr[i];
	    }
	    for (int i = mid; i < n; i++) {
	        right[i - mid] = arr[i];
	    }
	    mergeSortArrChar(left);
	    mergeSortArrChar(right);
	    mergeArrChar(left, right, arr);
	}

	private void mergeArrChar(char[] left, char[] right, char[] arr) {
	    int nL = left.length;
	    int nR = right.length;
	    int i = 0, j = 0, k = 0;
	    while (i < nL && j < nR) {
	        if (left[i] <= right[j]) {
	            arr[k] = left[i];
	            i++;
	        } else {
	            arr[k] = right[j];
	            j++;
	        }
	        k++;
	    }
	    while (i < nL) {
	        arr[k] = left[i];
	        i++;
	        k++;
	    }
	    while (j < nR) {
	        arr[k] = right[j];
	        j++;
	        k++;
	    }
	}
	
	// ArrayList Integer
	public void mergeSortArrListInt(ArrayList<Integer> arr) {
	    int n = arr.size();
	    if (n <= 1) {
	        return;
	    }
	    int mid = n / 2;
	    ArrayList<Integer> left = new ArrayList<Integer>(arr.subList(0, mid));
	    ArrayList<Integer> right = new ArrayList<Integer>(arr.subList(mid, n));
	    mergeSortArrListInt(left);
	    mergeSortArrListInt(right);
	    mergeArrListInt(left, right, arr);
	}

	private void mergeArrListInt(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> arr) {
	    int nL = left.size();
	    int nR = right.size();
	    int i = 0, j = 0, k = 0;
	    while (i < nL && j < nR) {
	        if (left.get(i) <= right.get(j)) {
	            arr.set(k, left.get(i));
	            i++;
	        } else {
	            arr.set(k, right.get(j));
	            j++;
	        }
	        k++;
	    }
	    while (i < nL) {
	        arr.set(k, left.get(i));
	        i++;
	        k++;
	    }
	    while (j < nR) {
	        arr.set(k, right.get(j));
	        j++;
	        k++;
	    }
	}
	
	// ArrayList Char
	public static void mergeSortArrListChar(ArrayList<Character> arr) {
	    int n = arr.size();
	    if (n <= 1) {
	        return;
	    }
	    int mid = n / 2;
	    ArrayList<Character> left = new ArrayList<Character>(arr.subList(0, mid));
	    ArrayList<Character> right = new ArrayList<Character>(arr.subList(mid, n));
	    mergeSortArrListChar(left);
	    mergeSortArrListChar(right);
	    mergeArrListChar(left, right, arr);
	}

	private static void mergeArrListChar(ArrayList<Character> left, ArrayList<Character> right, ArrayList<Character> arr) {
	    int nL = left.size();
	    int nR = right.size();
	    int i = 0, j = 0, k = 0;
	    while (i < nL && j < nR) {
	        if (left.get(i) <= right.get(j)) {
	            arr.set(k, left.get(i));
	            i++;
	        } else {
	            arr.set(k, right.get(j));
	            j++;
	        }
	        k++;
	    }
	    while (i < nL) {
	        arr.set(k, left.get(i));
	        i++;
	        k++;
	    }
	    while (j < nR) {
	        arr.set(k, right.get(j));
	        j++;
	        k++;
	    }
	}




}

