package OOPS.DSA.Sorting;

import OOPS.Helper.Helper;

public class MergeSort {

  public static void mergeArray(int arr[], int si, int mid, int ei) {
    int merged[] = new int[ei - si + 1];

    int index1 = si;
    int index2 = mid + 1;
    int x = 0;

    while (index1 <= mid && index2 <= ei) {
      if (arr[index1] <= arr[index2]) {
        merged[x++] = arr[index1++];
      } else {
        merged[x++] = arr[index2++];
      }
    }

    while (index1 <= mid) {
      merged[x++] = arr[index1++];
    }
    while (index2 <= ei) {

      merged[x++] = arr[index2++];
    }

    for (int i = 0, j = si; i < merged.length; i++, j++) {
      arr[j] = merged[i];
    }

  }

  public static void mergeSort(int arr[], int si, int ei) {
    //

    if (si >= ei) {
      return;
    }

    int mid = si + (ei - si) / 2;

    // Left Part Divide

    mergeSort(arr, si, mid);

    // Right Part Divide

    mergeSort(arr, mid + 1, ei);

    // Conquere The Array

    mergeArray(arr, si, mid, ei);

  }

  public static void main(String[] args) {
    int arr[] = Helper.arr;
    mergeSort(arr, 0, arr.length - 1);
    Helper.PrintArray(arr);
  }
}
