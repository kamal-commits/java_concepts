package OOPS.DSA.Sorting;

import OOPS.Helper.Helper;

public class SelectionSort {

  public static void main(String args[]) {

    int array[] = Helper.arr;

    for (int i = 0; i < array.length - 1; i++) {
      // System.out.println(i);
      int smallest = i;

      for (int j = i + 1; j < array.length; j++) {
        if (array[smallest] > array[j]) {
          smallest = j;
        }
      }
      Helper.SwapValues(array, smallest, i);

    }

    Helper.PrintArray(array);
  }

}
