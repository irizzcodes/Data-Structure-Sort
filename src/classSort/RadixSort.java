package classSort;

import java.util.ArrayList;

public class RadixSort {
	// Array Integer
    public void radixSortArrInt(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int exp = 1;
        while (max / exp > 0) {
            countSortArrInt(arr, exp);
            exp *= 10;
        }
    }

    private void countSortArrInt(int[] arr, int exp) {
        int[] count = new int[10];
        int[] output = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    // Array Char
    public void radixSortArrChar(char[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int exp = 1;
        while (max / exp > 0) {
            countSortArrChar(arr, exp);
            exp *= 10;
        }
    }

    private void countSortArrChar(char[] arr, int exp) {
        int[] count = new int[256];
        char[] output = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i] / exp % 256]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] / exp % 256] - 1] = arr[i];
            count[arr[i] / exp % 256]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
    
    //ArrayList Integer
    public void radixSortArrListInt(ArrayList<Integer> arr) {
        if (arr == null || arr.size() == 0) {
            return;
        }

        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }

        int exp = 1;
        while (max / exp > 0) {
            countSortArrListInt(arr, exp);
            exp *= 10;
        }
    }

    private void countSortArrListInt(ArrayList<Integer> arr, int exp) {
        int[] count = new int[10];
        Integer[] output = new Integer[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            count[arr.get(i) / exp % 10]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            output[count[arr.get(i) / exp % 10] - 1] = arr.get(i);
            count[arr.get(i) / exp % 10]--;
        }

        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, output[i]);
        }
    }
    
    //ArrayList Char
    public void radixSortArrListChar(ArrayList<Character> arr) {
        if (arr == null || arr.size() == 0) {
            return;
        }

        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }

        int exp = 1;
        while (max / exp > 0) {
            countSortArrListChar(arr, exp);
            exp *= 10;
        }
    }

    private void countSortArrListChar(ArrayList<Character> arr, int exp) {
        int[] count = new int[256];
        Character[] output = new Character[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            count[arr.get(i) / exp % 256]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            output[count[arr.get(i) / exp % 256] - 1] = arr.get(i);
            count[arr.get(i) / exp % 256]--;
        }

        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, output[i]);
        }
    }


    

    
}
