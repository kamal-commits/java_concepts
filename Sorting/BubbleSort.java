package OOPS.DSA.Sorting;

import OOPS.Helper.Helper;

public class BubbleSort {

  public static void main(String args[]) {
    System.out.println("WORKING BRO...");
    int array[] = Helper.arr;

    // Time Complexity = O(n^2) {^ === Square}
    // bubble Sort logic

    for (int i = 0; i < array.length - 1; i++) {

      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          Helper.SwapValues(array, j, j + 1);
        }
      }

    }

    Helper.PrintArray(array);

  }

}
