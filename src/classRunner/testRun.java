package classRunner;

import classSort.InsertionSort;
import classSort.HeapSort;
import classSort.MergeSort;
import classSort.ShellSort;

public class testRun {
	public static void main(String[] args) {
		// Objects ( Sort )
		InsertionSort insertionSort = new InsertionSort();
		HeapSort heapSort = new HeapSort();
		MergeSort mergeSort = new MergeSort();
		ShellSort shellSort = new ShellSort();
		
		//List
		int[] intList1 = { 5, 21, 66, 35, 32, 29, 11 };
		int[] intList2 = { 23, 6, 26, 9, 72, 45, 1, 19 };
		int[] intList3 = { 55, 67, 89, 18, 23, 7, 12 };
		
		//Print before Sorting
		System.out.println("Before Shell Sort");
		for(int values: intList1)
			System.out.print(values + ", ");
		
		System.out.println();
		
		System.out.println("Before Heap Sort");
		for(int values: intList3)
			System.out.print(values + ", ");
		
		System.out.println();
		
		System.out.println("Before Merge Sort");
		for(int values: intList2)
			System.out.print(values + ", ");
		
		System.out.println();
		System.out.println();
		
		//Sort 
		heapSort.heapSortArrInt(intList3);
		mergeSort.mergeSortArrInt(intList2);
		shellSort.shellSortArrInt(intList1);
		
		//Print
		
		System.out.println("Shell Sort");
		for(int values: intList1)
			System.out.print(values + ", ");
		
		System.out.println();
		
		System.out.println("Heap Sort");
		for(int values: intList3)
			System.out.print(values + ", ");
		
		System.out.println();
		
		System.out.println("Merge Sort");
		for(int values: intList2)
			System.out.print(values + ", ");
		
		
	}

}
