package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
   int len = arr.length;
            int last = arr[len-1];
            for(int i = len-1; i >= 1; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = last;

  }

}
