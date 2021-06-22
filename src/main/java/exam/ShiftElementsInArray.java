package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int len = arr[arr.length-1];
    for(int i= arr.length-1; i>0; i--) {
      arr[i] = arr[i-1];
    }
    arr[0] = len;
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+ " ");
    }
  }

}
