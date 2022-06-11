package OOPS.DSA.Sorting;

import OOPS.Helper.Helper;

public class InsertionSort {
  public static void main(String args[]) {
    //
    int arr[] = Helper.arr;

    for (int i = 0; i < arr.length; i++) {
      int key = arr[i];
      int j = i - 1;

      while (j >= 0 && key < arr[j]) {
        arr[j + 1] = arr[j];
        j--;
      }

      arr[j + 1] = key;
    }

    Helper.PrintArray(arr);
  }
}
