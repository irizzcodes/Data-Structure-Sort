package classRunner;
import classSort.InsertionSort;
import classSort.ShellSort;
import classSort.MergeSort;
import classSort.HeapSort;
import classSort.BubbleSort;
import classSort.QuickSort;
import classSort.SelectionSort;

public class SortingAlgorithmsRunningTime {

public static void main(String[] args) {

System.out.println("Array of 1,000 numbers");

for (int count = 1; count < 15; count++)

{

if (count == 1) {

long startTime = System.currentTimeMillis();

int[] data = new int[1000];

for (int i = 0; i < 1000; i++) {

data[i] = (int) (Math.random() * 0x3E8);

}

BubbleSort bs = new BubbleSort();

bs.bubbleSortArrInt(data);

long endTime1 = System.currentTimeMillis();

long elapseTime = endTime1 - startTime;

System.out.println("the execution time of a bubble sort is " + elapseTime + " ms");

} //record running time of quick sort

else if (count == 2) {

long startTime = System.currentTimeMillis();

int[] data = new int[1000];

for (int i = 0; i < 1000; i++) {

data[i] = (int) (Math.random() * 0x3E8);

}

QuickSort qs = new QuickSort();

qs.quickSortArrInt(data);

long endTime2 = System.currentTimeMillis();

long elapseTime = endTime2 - startTime;

System.out.println("the execution time of a quick sort is " + elapseTime + " ms");


} //record running time of selection sort

else if (count == 3) {

long startTime = System.currentTimeMillis();

int[] data = new int[1000];

for (int i = 0; i < 1000; i++) {

data[i] = (int) (Math.random() * 0x3E8);

}


SelectionSort ss = new SelectionSort();

ss.selectionSortArrInt(data);

long endTime3 = System.currentTimeMillis();

long elapseTime = endTime3 - startTime;


System.out.println("the execution time of a selection sort is " + elapseTime + " ms");


System.out.println("Array of 10,000 numbers");

}

else if (count == 4) {

long startTime = System.currentTimeMillis();

int[] data = new int[10000];


for (int i = 0; i < 10000; i++) {

data[i] = (int)

(Math.random() * 0x2710);

}

InsertionSort is = new InsertionSort();

is.insertionSortArrInt(data);

long endTime = System.currentTimeMillis();

long elapseTime = endTime - startTime;

System.out.println("the execution time of a Insertion Sort is " + elapseTime + " ms");

}

else if (count == 5) {

long startTime = System.currentTimeMillis();

int[] data = new int[10000];


for (int i = 0; i < 10000; i++) {

data[i] = (int)

(Math.random() * 0x2710);

}

ShellSort ss = new ShellSort();

ss.shellSortArrInt(data);

long endTime = System.currentTimeMillis();

long elapseTime = endTime - startTime;

System.out.println("the execution time of a Shell Sort is " + elapseTime + " ms");

}

else if (count == 6) {

long startTime = System.currentTimeMillis();

int[] data = new int[10000];

for (int i = 0; i < 10000; i++) {

data[i] = (int)

(Math.random() * 0x2710);

}

HeapSort hs = new HeapSort();

hs.heapSortArrInt(data);

long endTime = System.currentTimeMillis();

long elapseTime = endTime - startTime;

System.out.println("the execution time of a Heap Sort is " + elapseTime + " ms");

System.out.println("Array of 100,000 numbers");

}

else if (count == 7) {

long startTime = System.currentTimeMillis();

int[] data = new int[100000];

for (int i = 0; i < 100000; i++) {

data[i] = (int)

(Math.random() * 0x186A0);

}

MergeSort ms = new MergeSort();

ms.mergeSortArrInt(data);

long endTime = System.currentTimeMillis();

long elapseTime = endTime - startTime;

System.out.println("the execution time of a Merge Sort is " + elapseTime + " ms");

}

else if (count == 8) {

long startTime = System.currentTimeMillis();

int[] data = new int[100000];

for (int i = 0; i < 100000; i++) {

data[i] = (int)

(Math.random() * 0x186A0);

}

QuickSort qs = new QuickSort();

qs.quickSortArrInt(data);

long endTime = System.currentTimeMillis();

long elapseTime = endTime - startTime;

System.out.println("the execution time of a Another Quick Sort is " + elapseTime + " ms");

}

else if (count == 9) {

long startTime = System.currentTimeMillis();

int[] data = new int[100000];

for (int i = 0; i < 100000; i++) {

data[i] = (int)

(Math.random() * 0x186A0);

}

InsertionSort is = new InsertionSort();

is.insertionSortArrInt(data);

long endTime = System.currentTimeMillis();

long elapseTime = endTime - startTime;

System.out.println("the execution time of a Another Insertion Sort is " + elapseTime + " ms");

}

else if (count == 10) {

long startTime = System.currentTimeMillis();

int[] data = new int[100000];

for (int i = 0; i < 100000; i++) {

data[i] = (int)

(Math.random() * 0x186A0);

}

SelectionSort is = new SelectionSort();

is.selectionSortArrInt(data);

long endTime = System.currentTimeMillis();

long elapseTime = endTime - startTime;

System.out.println("the execution time of a Another Selection Sort is " + elapseTime + " ms");

}

else if (count == 11) {

long startTime = System.currentTimeMillis();

int[] data = new int[100000];

for (int i = 0; i < 100000; i++) {

data[i] = (int)

(Math.random() * 0x186A0);

}

BubbleSort is = new BubbleSort();

is.bubbleSortArrInt(data);

long endTime = System.currentTimeMillis();

long elapseTime = endTime - startTime;

System.out.println("the execution time of a Another Bubble Sort is " + elapseTime + " ms");

}
}

}

}



