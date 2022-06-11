package OOPS.Helper;

public class Helper {

  public static int arr[] = { 7, 8, 3, 1, 2 };

  public static void PrintArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " ");
      // System.out.println();
    }
    System.out.println();

  }

  public static void SwapValues(int arr[], int first, int second) {

    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;

  }
}
