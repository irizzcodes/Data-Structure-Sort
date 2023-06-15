package classRunner;
import java.util.Scanner;
import java.util.ArrayList;
import classSort.HeapSort;
import classSort.InsertionSort;
import classSort.MergeSort;
import classSort.ShellSort;

public class testRunner {
	public static void main (String[] args) {
		// Objects ( Sort )
			InsertionSort insertionSort = new InsertionSort();
			HeapSort heapSort = new HeapSort();
			MergeSort mergeSort = new MergeSort();
			ShellSort shellSort = new ShellSort();
				
		//List
			int[] intList1 = { 5, 21, 66, 35, 32, 29, 11 };
				
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		/*System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for (int i= 0; i<n; i++) {
		System.out.println("Enter Values of array:");
		array.push(sc.nextInt());
		}*/
		
		System.out.println("Do you wish to add array to arraylist? (Y/N)");
		char choice = sc.next().charAt(0);
		switch (choice){
		case 'y':
		for(int values : intList1)
			arrList.add(values);
		break;
		}
		
		
		System.out.println("Pick a number: ");
		System.out.println("1 is: Shell Short ");
		System.out.println("2 is: Heap Sort");
		System.out.println("3 is: Merge Sort");
		short choices = sc.nextShort();
		switch (choices){
		case 1:
			shellSort.shellSortArrListInt(arrList);
		break;
		case 2:
			heapSort.heapSortArrListInt(arrList);
		break;
		case 3:
			mergeSort.mergeSortArrListInt(arrList);
		break;
		}
		
		System.out.println("Output is: ");
		System.out.println(arrList);
			
		
		
		
	}

}
